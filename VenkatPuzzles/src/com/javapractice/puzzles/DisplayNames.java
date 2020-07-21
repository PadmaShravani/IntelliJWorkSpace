package com.javapractice.puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayNames {
    List<String> lNames = new ArrayList<String>();

    public List<String> createList() {
        lNames.add("PadmaShravani");
        lNames.add("lekha");
        lNames.add("deepthi");
        lNames.add("Venkat");
        lNames.add("Suresh");
        return lNames;
    }

    public void printList() {
        for (String l : lNames) {
            System.out.println(l);
        }
    }
}
