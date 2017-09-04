package org.ipredybaylo;

import org.ipredybaylo.linked_list_collection.SorterLL;
import org.ipredybaylo.mathset.MathSet;
import org.ipredybaylo.mathset.Task;
import org.ipredybaylo.mathset.TaskImpl;

import java.util.HashSet;
import java.util.Random;
import java.util.*;

import static org.ipredybaylo.mathset.MathSet.*;


public class App {

    //**************************************************************************
    private static int n = 0, rnd = 0, rndm = 0;
    private static Random rand = new Random();
    //**************************************************************************

    public static void main(String[] args) {
        n = scannerN();
        rnd = scannerRND();

        Set<Integer> set1 = new HashSet<>(n);
        Set<Integer> set2 = new HashSet<>(n);

        n = n;
        rndm = rnd / 2;

        for (int i = 0; i < n; i++) {
            set1.add(rand.nextInt(rnd) - rndm);
            set2.add(rand.nextInt(rnd) - rndm);
        }

        Task task = new TaskImpl();
        task.getCross(set1,set2);
        task.getCrossStream(set1,set2);
        task.printer2Set(set1, set2);
    }

}




