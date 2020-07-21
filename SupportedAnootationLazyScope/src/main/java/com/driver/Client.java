package com.driver;

import com.bean.Address;
import com.bean2.Employee;
import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
        Address bean1=ac.getBean("address", Address.class);
        Employee bean2=ac.getBean("employee", Employee.class);

        Address abean1=ac.getBean("address", Address.class);
        Employee ebean2=ac.getBean("employee", Employee.class);

        System.out.println(bean1.toString()+" "+bean1.hashCode());
        System.out.println(abean1.toString()+" "+abean1.hashCode()+"\n");

        System.out.println(bean2.toString()+" "+bean2.hashCode());
        System.out.println(ebean2.toString()+" "+ebean2.hashCode());
    }
}
