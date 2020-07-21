package com.homework;

public class OddNum extends Thread {
    public void run(){
        oddNum();
    }
    public void oddNum(){
        for(int i=0;i<=10;i++){
            if(i%2!=0){
            System.out.println(Thread.currentThread().getName()+i);
        }
        }

    }
}
