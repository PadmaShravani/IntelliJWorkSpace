package com.practice;

public class AnonymusClass {
    public static void main(String[] args) {
        Addition a=new Addition() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        System.out.println(a.sum(5,10));
    }
}

interface Addition{
    public int sum(int a,int b);
}
