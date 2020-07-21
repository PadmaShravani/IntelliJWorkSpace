package com.practice;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class AnonymusThread {
    public static void main(String[] args) {
        Thread t= new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println(i);
                }
            }
        };
        System.out.println(t);
        t.start();
    }
}
