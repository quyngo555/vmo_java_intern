package com.advance.threadpool;

public class WorkerThread implements Runnable{
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " (Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName()
                + " (End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
