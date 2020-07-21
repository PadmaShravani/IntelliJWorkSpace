package com.homework;

public class EvenNum extends Thread {
    public void run(){
        evenNum();
    }
    public void evenNum(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+i+" ");
            }
        }
    }
}
