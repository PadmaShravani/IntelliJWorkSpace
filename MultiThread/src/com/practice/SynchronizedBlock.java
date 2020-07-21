package com.practice;

import java.awt.image.SampleModel;

public class SynchronizedBlock {
    public static void main(String[] args) {
        Sample s=new Sample();
        Thread t=new Thread(s);
        t.start();
        Thread t1=new Thread(s);
        t1.start();
    }
}
class Sample implements Runnable{
    public void run(){
        disp();
    }
    public void disp(){
        System.out.println(Thread.currentThread().getName());
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }
}
