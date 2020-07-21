package com.practice;

public class CreatingThreadUsingTheadClass extends Thread{

    public void run(){

        disp();
        System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getState()+"\n"+
        Thread.currentThread().getPriority()+"\n"+Thread.currentThread().isAlive()
        +"\n"+Thread.currentThread().isDaemon()+"\n"+Thread.currentThread().isInterrupted());
    }
    public void disp(){
        for(int i=0;i<=10;i++){
            yield();
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(i);
        }

    }

}
