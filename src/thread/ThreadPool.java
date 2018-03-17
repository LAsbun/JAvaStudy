/*
@author: sws
@software: IntelliJ IDEA
@file: ThreadPool.java
@time: 3/17/18 6:16 PM
@desc:
*/

package thread;

import java.util.concurrent.*;


class RunnableTask implements Runnable {

    private String name;

    public RunnableTask(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; ++i) {
                System.out.println(this.name + " " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyCallable implements Callable<Integer> {
    /*
        实现两个数的加法
     */
    int x = 5;
    int y = 3;

    public MyCallable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        return x + y;
    }
}

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        /*
            使用 Runnable 没有返回值
         */

        /*

        ExecutorService service = Executors.newFixedThreadPool(5);


        service.submit(new RunnableTask("A"));
        System.out.println();
        service.submit(new RunnableTask("B"));

        service.shutdown();
        */

        /*
            使用 Callable Future 可以有返回值
         */

        ExecutorService service = Executors.newFixedThreadPool(5);

        Future<Integer> res1 = service.submit(new MyCallable(2, 6));

        System.out.println("2 + 6 is " + res1.get());

        Future<Integer> res2 = service.submit(new MyCallable(9, 88));

        System.out.println("9 + 88 is " + res2.get());

        service.shutdown();
    }
}
