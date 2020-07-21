package com.practice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadMain {
    public static void main(String[] args) throws Exception {
        CallableThread c=new CallableThread();
//        System.out.println( c.call());
        ExecutorService ex= Executors.newFixedThreadPool(10);
        Future f= ex.submit(c);
        System.out.println(f.get());
    }
}
