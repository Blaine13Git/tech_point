package com.windsing.tech_point.about_thread;

public class AboutThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            System.out.println("thread2");
        }, "thread2");
        thread.start();

        System.out.println("main1");

        thread.join();

        System.out.println("main2");

    }

    public static void method01() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thead1");
            }
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        }, "thread2");

        thread1.start();
        thread2.start();
        thread1.sleep(1000);

        // thread1.stop(); // stop() 被removal移除，使用 interrupt()
//        thread1.interrupt(); // inform VM of interrupt
    }

    public static void method02() {


    }
}
