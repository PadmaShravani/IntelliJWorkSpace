package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put("Sahana",20);
        table.put("Shaunak",14);
      //  table.put(null,0);
        System.out.println(table);
        Enumeration<Integer> e=table.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

}
