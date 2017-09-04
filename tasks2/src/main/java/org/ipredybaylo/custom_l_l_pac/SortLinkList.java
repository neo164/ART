package org.ipredybaylo.custom_l_l_pac;

import java.util.Random;

/*
*
* 1) Есть линкед лист заполненный случайными целочисленными значениями,
* Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец,
* а положительные - в начало этого списка.
*
* */

class NodeSort {
    int value;
    NodeSort next;

    private static SortLinkList intbox = new SortLinkList();
    private static Random randomGenerator = new Random();

    //------------------------------------------------------------
    NodeSort(int val) {
        value = val;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeSort getNext() {
        return next;
    }

    public void setNext(NodeSort next) {
        this.next = next;
    }
}
//------------------------------------------------------------

public class SortLinkList {
    NodeSort head;
    int size = 0;

    NodeSort add(int val) {

        if (head == null) {
            NodeSort node = new NodeSort(val);
            head = node;
            size++;
            return head;
        }
        NodeSort temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        NodeSort newNode = new NodeSort(val);
        temp.setNext(newNode);
        newNode.setNext(null);
        size++;
        return head;
    }

    //------------------------------------------------------------
    NodeSort sort(NodeSort nodeSort) {

        for (int i = size - 1; i >= 1; i--) {
            NodeSort finalval = nodeSort;
            NodeSort tempNode = nodeSort;

            for (int j = 0; j < i; j++) {

                int val1 = nodeSort.value;
                NodeSort nextnode = nodeSort.next;
                int val2 = nextnode.value;

                if (val1 < val2) {     //отриц. в конец
                    //     if (val1 > val2) {   //отриц. в начало

                    if (nodeSort.next.next != null) {
                        NodeSort CurrentNext = nodeSort.next.next;
                        nextnode.next = nodeSort;
                        nextnode.next.next = CurrentNext;
                        if (j == 0) {
                            finalval = nextnode;
                        } else
                            nodeSort = nextnode;

                        for (int l = 1; l < j; l++) {
                            tempNode = tempNode.next;
                        }

                        if (j != 0) {
                            tempNode.next = nextnode;

                            nodeSort = tempNode;
                        }
                    } else if (nodeSort.next.next == null) {
                        nextnode.next = nodeSort;
                        nextnode.next.next = null;
                        for (int l = 1; l < j; l++) {
                            tempNode = tempNode.next;
                        }
                        tempNode.next = nextnode;
                        nextnode = tempNode;
                        nodeSort = tempNode;

                    }

                } else
                    nodeSort = tempNode;
                nodeSort = finalval;
                tempNode = nodeSort;
                for (int k = 0; k <= j && j < i - 1; k++) {
                    nodeSort = nodeSort.next;
                }

            }

        }
        return nodeSort;

    }


}


