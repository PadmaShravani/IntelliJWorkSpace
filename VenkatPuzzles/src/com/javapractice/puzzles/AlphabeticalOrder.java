package com.javapractice.puzzles;

import java.util.*;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> list = new ArrayList<Character>();
        System.out.println("Enter a sentence which contains 10 words");
        String sentence = input.nextLine();
        char[] cArray = sentence.toCharArray();

        // String[] sArry = sentence.split("");
        for (int i = 0; i < cArray.length; i++) {
            System.out.print(cArray[i]);
            list.add(cArray[i]);
        }
        for (Character s : list) {
            System.out.print(s + " ");
        }
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);
        for (Character s : list) {
            System.out.print(s + " ");
        }
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : cArray) {
            if (map.containsKey(c)) {
                //If char 'c' is present in map, incrementing it's count by 1

                map.put(c, map.get(c) + 1);
            } else {
                //If char 'c' is not present in map,
                //putting 'c' into map with 1 as it's value

                map.put(c, 1);
            }
        }

        //Printing inputString and charCountMap

        System.out.println(sentence + " : " + map);


//        for(char c : cArray)
//        {
//            if(map.containsKey(c)) {
//                 count = map.get(c);
//                map.put(c, ++count);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        System.out.println("Duplicate characters:");
//
//        //Print duplicate characters
//        for(char c : map.keySet()) {
//            if(map.get(c) > 1) {
//                System.out.println(c);
//            }
//        }
//        System.out.println("Duplicate characters excluding white space :");
//
//        //Print duplicate characters excluding white space
//        for(char c : map.keySet()) {
//            if(map.get(c) > 1 && !Character.isWhitespace(c)) {
//                System.out.println(c +" "+count);
//            }
//        }
//
//        System.out.println("Distinct characters:");
//
//        //Print distinct characters
//        for(char c : map.keySet()) {
//            if(map.get(c) == 1) {
//                System.out.println(c +" 1");
//            }
//        }

}
        }

