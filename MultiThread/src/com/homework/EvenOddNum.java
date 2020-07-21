package com.homework;
//Q:one thread print even number and another thread print odd number?
public class EvenOddNum {
    public static void main(String[] args) {
        EvenNum e=new EvenNum();
        OddNum o=new OddNum();
        e.setName("Even num Thread");
        e.start();
        try {
            e.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        o.setName("Odd num Thread");
        o.start();
        try {
            o.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("*****************The End********************");
    }
}
