package org.ipredybaylo.mathset;

import java.util.Scanner;
/*
* 2) Определить класс mathset на основе множества целых чисел, n = размер.
* Создать методы для определения пересечения и объединения множеств.
*/

public class MathSet {

    private static int n = 0, rnd = 0, rndm = 50;

    private static final int MAX_ATTERMS = 2, DEF_VAL = 10, NUM_MIN = 2, NUM_MAX = 20,
    RND_MIN = 10, RND_MAX = 200;

    public static int scannerN() {
        Scanner in = new Scanner(System.in);
        boolean flag1 = false;
        int countErrN = 0;
        //--------------------number's--------------------
        while (n < NUM_MIN || n > NUM_MAX) {
            System.out.println("Input number's of Set1 & Set2: (2...20). Attempt's is: " + countErrN);
            n = in.nextInt();
            countErrN++;
            if (countErrN > MAX_ATTERMS) {
                System.out.println("ok number's = 10");
                flag1 = true;
            }
            if (flag1) n = DEF_VAL;
        }
        return n;
    }

    public static int scannerRND() {

        Scanner in = new Scanner(System.in);
        boolean flag2 = false;
        int countErrR = 0;

        //--------------------range--------------------
        while (rnd < RND_MIN || rnd > RND_MAX) {
            System.out.println("Input random range / 2: (10...200). Attempt's is: " + countErrR);
            rnd = in.nextInt();
            rndm = rnd / 2;
            countErrR++;
            if (countErrR > MAX_ATTERMS) {
                System.out.println("ok range = 10");
                flag2 = true;
            }
            if (flag2) rnd = DEF_VAL;
        }
        System.out.println("Random range: -" + rndm + "...+" + rndm);

        return rnd;

    }

}
