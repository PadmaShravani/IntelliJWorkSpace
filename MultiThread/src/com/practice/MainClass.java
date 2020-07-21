package com.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        CreatingThreadUsingTheadClass thread=new CreatingThreadUsingTheadClass();
        //thread.setDaemon(true);
       // thread.start();
        ExecutorService e=Executors.newFixedThreadPool(5);
        e.submit(thread);
    }
}
