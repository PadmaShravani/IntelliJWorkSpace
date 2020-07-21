package com.polimorphism;

public class Calculations {
    public static void main(String[] args) {
    ArithmaticOperations ao=new ArithmaticOperations();
        ao.sum(2,5);
        System.out.println("sum of double and integer "+ao.sum(5.9,5));
        ao.sum(6,2.6);
    }
}
