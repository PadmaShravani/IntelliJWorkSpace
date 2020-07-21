package com.polimorphism;

public class ArithmaticOperations {
    int a,b,addition;
    double x,result;
    public void sum(int a,int b){
        addition=a+b;
        System.out.println("sum of two integers :"+addition);
    }
    public void sum(int a,double x){
        result=a+x;
        System.out.println("sum of int and double :"+result);
    }
    double sum(double x,int a){
        return x+a;
    }


}
