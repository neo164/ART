package org.predybaylo;

import java.util.Stack;

public class App
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Producer thread1 = new Producer(stack);// prod
        Consumer thread2 = new Consumer(stack);// cons

        Thread A = new Thread(thread1);
        Thread B = new Thread(thread2);
        Thread C = new Thread(thread2);
        A.start();

        B.start();
        C.start();
    }

}
