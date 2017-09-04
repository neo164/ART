package org.ipredybaylo.linked_list_collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;


public class SorterLL {
    private static LinkedList<Integer> list;

    private void sort() {
        System.out.print("natural order sorted: ");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    private void size() {
        System.out.println("size list item: [" + list.size() + "]");
    }

    private void testList() {
        String s = " ";
        System.out.print("unsorted: [");
        list.stream().map(list-> s + list).forEach(System.out::print);
        System.out.println("]");
        //list.forEach(System.out::print);
        //System.out.println(list);

        System.out.print("order sorted: ");
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        size();
        sort();

        System.out.print("clean list...");
        list.clear();
        System.out.print("item's list: ");
        System.out.println(list);
        System.out.print("after cleaning size: ");
        System.out.println(list.size());
        System.out.println();
    }


    private boolean init(boolean flag){
        flag =false;
        int r = 5;
        Random rand = new Random();
        list = new LinkedList<>();

        for (int i = 1; i <= r; i++) {
            list.add(rand.nextInt(100) - 50);
        }

        if (list.size()!=0){
           return flag=true;
        }
        else{
            flag=false;
        }
            return flag;
    }

//    public static void main(String a[]) {
//        SorterLL msb = new SorterLL();
//
//
//
//        msb.testList();
//    }

}
