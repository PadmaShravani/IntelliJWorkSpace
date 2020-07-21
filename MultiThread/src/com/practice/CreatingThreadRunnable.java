package com.practice;

public class CreatingThreadRunnable implements Runnable{

    @Override
    public void run() {
        say();
    }
    public void say(){
        for(int i=0;i<=5;i++)
        System.out.println("Hello Multithread");
    }
}
