package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 = " + myThread.getState()); // NEW
        log("myThread.start()");
        myThread.start();
        Thread.sleep(1000);
        log("myThread.state3 = " + myThread.getState()); // NEW
        Thread.sleep(4000);
        log("myThread.state5 = " + myThread.getState()); // NEW
        log("end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                log("Start");
                log("myThread.state2 = " + Thread.currentThread().getState()); // NEW
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state4 = " + Thread.currentThread().getState()); // NEW
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
