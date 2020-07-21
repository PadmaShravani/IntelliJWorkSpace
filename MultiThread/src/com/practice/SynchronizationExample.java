package com.practice;

public class SynchronizationExample {
    public static void main(String[] args) {
        WhySynchronized s=new WhySynchronized();
        Thread t=new Thread(s);
        Thread t1=new Thread(s);
        t.start();
        t1.start();

        WhySynchronized s1=new WhySynchronized();
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        t2.start();
        t3.start();

    }
}
class WhySynchronized implements Runnable{
    @Override
    public  void run() {
        disp();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void disp(){
        for(int i=0;i<5;i++){
            System.out.println(i*2);
        }
    }

}
