package com.itproger.threads;

public class Main {

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        TestThread testThread1 = new TestThread();

        testThread1.start();
        testThread.start();

//        --------------------------------------------------------------------------------------------------------------

//        SomeThread someThread2 = new SomeThread();
//        SomeThread someThread3 = new SomeThread();

//        someThread3.run();
//        someThread2.run();

//        --------------------------------------------------------------------------------------------------------------

        Thread thread = new Thread(new TestRunnable());
        Thread thread1 = new Thread(new TestRunnable());

        thread.start();
        thread1.start();

//        --------------------------------------------------------------------------------------------------------------

        Thread threadWithoutClass = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Number: " + i);
                }
            }
        });
        threadWithoutClass.start();
    }
}
