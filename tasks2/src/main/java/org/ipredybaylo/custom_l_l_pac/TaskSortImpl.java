package org.ipredybaylo.custom_l_l_pac;

import java.util.Random;

/**
 * Created by ipredybaylo on 17-Apr-17.
 */
public class TaskSortImpl implements TaskSort {
    @Override
    public NodeSort sort(NodeSort nodeSort) {
        return null;
    }

    @Override
    public NodeSort add(int val) {
        return null;
    }

    @Override
    public NodeSort randomAdder() {
        SortLinkList intbox = new SortLinkList();
        Random randomGenerator = new Random();
        boolean flag = false;
        NodeSort head = null;
        for (int i = 0; i < 10; i++) {
            head = intbox.add(randomGenerator.nextInt(100) - 50);
        }
        if (intbox.size != 0) {
            return head;
        }
        else{
            return null;
        }
                
    }
}
