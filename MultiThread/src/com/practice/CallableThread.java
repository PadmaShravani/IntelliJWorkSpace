package com.practice;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {

    @Override
    public Integer call() throws Exception {
        int a=10;
        int b=30;
        int res=a+b;
        return res;
    }
}
