package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class Address {
    @Value("1525")
    private String hno;
    @Value("Plano")
    private String location;

    @Override
    public String toString() {
        return "Address{" +
                "hno='" + hno + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
