package com.practice;

import java.util.concurrent.*;

public class AnonymusCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable c=new Callable(){
            @Override
            public String call() throws Exception {

                return "From Callable";
            }
        };
        ExecutorService ex= Executors.newFixedThreadPool(10);
        Future f=ex.submit(c);
        System.out.println(f.get());
    }
}
