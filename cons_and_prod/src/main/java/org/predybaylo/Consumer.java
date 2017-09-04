package org.predybaylo;

import java.util.Stack;


public class Consumer implements Runnable {
    Stack<Integer> A = new Stack<>();

    public Consumer(Stack<Integer> A) {
        this.A = A;
    }

    public synchronized void consume() {
        while (A.isEmpty()) {
            System.err.println("List is empty" + A + A.size());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println(A.pop() + " Consumed " + A);
        this.notify();
    }

    @Override
    public void run() {
        System.out.println("New consumer get started");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            consume();
        }
    }
}
