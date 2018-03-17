/*
@author: sws
@software: IntelliJ IDEA
@file: ThreadDemo.java
@time: 3/17/18 5:11 PM
@desc:
*/

package thread;

class ThreadClass extends Thread {

    private String threadName;

    ThreadClass(String name) {
        threadName = name;
        System.out.println("creating " + name);
    }

    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i > 0; --i) {
                System.out.println("Thread " + threadName + " " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Thread " + threadName + " end");
    }

    public void start() {
        System.out.println("Starting " + threadName);
//        t.start();
        // 如果需要调用下父类 start 否则不会调用run
        super.start();
    }
}


class RunnableClass implements Runnable {

    private String threadName;
    private Thread t;

    public RunnableClass(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i > 0; --i) {
                System.out.println("Thread " + threadName + " " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Thread " + threadName + " end");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
//        t.start();
        // 如果需要调用下父类 start 否则不会调用run
    }
}


public class ThreadDemo {

    public static void main(String[] args) {

        // extends Thread

        ThreadClass t1 = new ThreadClass("A");
        t1.start();
        ThreadClass t2 = new ThreadClass("B");
        t2.start();


        // implements Runnable  不会异步？
        RunnableClass t3 = new RunnableClass("C");
        t3.start();
        RunnableClass t4 = new RunnableClass("D");
        t4.start();

    }
}
