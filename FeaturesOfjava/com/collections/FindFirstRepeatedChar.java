package com.collections;

import sun.nio.cs.CharsetMapping;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedChar {
    public static void main(String[] args) {
        String s = "Bharathi";
        Map<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
//        for(char c:ch)
//        System.out.println(c);
        for(char i:ch){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }

        }
        for(Map.Entry<Character,Integer> e:map.entrySet()) {
//            if (e.getValue() > 1) {
//                System.out.println(e);
//                break;
//            }
            if (e.getValue() == 1) {
                System.out.println(e);
                break;
            }

        }
    }
}


