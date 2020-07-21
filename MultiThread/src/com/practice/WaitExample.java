package com.practice;

public class WaitExample {
    public synchronized  void disp(){
        System.out.println("started");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Execution done");
    }
    public synchronized void show(){
        System.out.println("wakeup time");
        notify();
    }
}
 class Driver{
    public static void main(String[] args) {
        WaitExample w=new WaitExample();
       Thread t1=new Thread(){
           public void run(){
               w.disp();
           }
       };
       Thread t2=new Thread(){
           public void run(){
               w.show();
           }
       };
       t1.start();
       t2.start();
    }
}