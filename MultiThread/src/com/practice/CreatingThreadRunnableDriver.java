package com.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreatingThreadRunnableDriver {
    public static void main(String[] args) {
        CreatingThreadRunnable t=new CreatingThreadRunnable();
        Thread thread=new Thread(t);
      //  thread.start();

//       Runtime r= Runtime.getRuntime();
//        r.addShutdownHook(thread);

       ExecutorService es= Executors.newFixedThreadPool(10);
        es.submit(thread);
    }
}
