package com.practice;

public class SynchronizedBlockStatic {
    public static void main(String[] args) {
        Foo f=new Foo();
        Thread t=new Thread(f);
        t.start();
        Thread t1=new Thread(f);
        t1.start();
    }
}

class Foo implements Runnable{
    public void run(){
        disp();
    }
    public  void disp() {
        System.out.println(Thread.currentThread().getName());
        synchronized (getClass()) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
                System.out.println(i);
            }
        }
    }
}