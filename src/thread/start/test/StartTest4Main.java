package thread.start.test;

import util.MyLogger;

public class StartTest4Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    MyLogger.log("A");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread-A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {

               while (true) {
                    MyLogger.log("B");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread-B").start();
    }
}
