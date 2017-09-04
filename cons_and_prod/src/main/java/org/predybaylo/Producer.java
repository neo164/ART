package org.predybaylo;

import java.util.Random;
import java.util.Stack;
import org.apache.log4j.Logger;


    public class Producer implements Runnable {

        final static Logger logger = Logger.getLogger(Producer.class);

        int result;
        Random rand = new Random();
        Stack<Integer> A = new Stack<>();

        public Producer(Stack<Integer> A) {
            this.A = A;
        }

        public synchronized void produce()
        {
            while (A.size() >= 10) {
                System.out.println("List is Full");
                //Log.info("entered some function");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            result = rand.nextInt(100);

            System.out.println(result + " produced ");
            A.push(result);
            System.out.println(A);

            this.notify();
        }

        @Override
        public void run() {
            System.out.println("Producer get started");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (true) {
                produce();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

