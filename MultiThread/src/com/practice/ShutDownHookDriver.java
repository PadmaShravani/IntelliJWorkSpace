package com.practice;

public class ShutDownHookDriver {
    public static void main(String[] args) {
        ShutDownHook s=new ShutDownHook();
      Runtime r=  Runtime.getRuntime();
      r.addShutdownHook(s);
    }
}
