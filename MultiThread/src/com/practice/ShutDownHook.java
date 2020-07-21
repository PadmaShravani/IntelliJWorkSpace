package com.practice;

public class ShutDownHook extends Thread{
    public void run(){
        message();
    }
    public void message(){
        System.out.println("System is going to shutdown");
    }
}
