package com.practice;

public class ClassLevelLocking {
    public static void main(String[] args) {
        Abc a=new Abc();
        Thread t=new Thread(a);
        Thread t1=new Thread(a);
        t.start();
        t1.start();
    }
}

class Abc implements Runnable{
    public void run(){
        disp();
    }
    public static synchronized void disp(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}