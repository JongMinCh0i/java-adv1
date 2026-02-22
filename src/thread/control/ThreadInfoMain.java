package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {

        //main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId=()=" + mainThread.threadId()); // 중복 되지 않음
        log("mainThread.getName=()=" + mainThread.getName());
        log("mainThread.getPriority()=" + mainThread.getPriority()); // 기본 값 5, 우선 순위가 높다고 해서 항상 더 많이 실행되는 것은 아님
        log("mainThread.getThreadGroup()=" + mainThread.getThreadGroup());
        log("mainThread.getState()=" + mainThread.getState());

        //my 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("mainThread = " + myThread);
        log("mainThread.threadId=()=" + myThread.threadId());
        log("mainThread.getName=()=" + myThread.getName());
        log("mainThread.getPriority()=" + myThread.getPriority()); // 기본 값 5
        log("mainThread.getThreadGroup()=" + myThread.getThreadGroup()); //  기본적으로 모든 스레드는 부모 스레드와 동일한 스레드 그룹에 속하게 된다. main
        log("mainThread.getState()=" + myThread.getState());
    }
}
