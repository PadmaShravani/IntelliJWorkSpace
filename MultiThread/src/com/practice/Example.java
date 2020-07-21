package com.practice;

public class Example {
   static Boolean b;
    static int x;
    static String s="Hello";
    public static void main(String[] args) {
        if(b==false && s=="Hello"){
            x=1;
            System.out.println(x);
        }else if(b==true && s=="Hello"){
            x=2;
            System.out.println(x);

        }else if(b!=null && s=="Hello"){
            x=3;
            System.out.println(x);
        }
        else {
            x=4;
            System.out.println(x);

        }
    }
}
