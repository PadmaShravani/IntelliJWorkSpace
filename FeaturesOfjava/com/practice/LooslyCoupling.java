package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LooslyCoupling {
    public static void main(String[] args) {
        Lion l = new Lion();
        Zoo zoo = new Zoo(l);
        zoo.animalSound();

        Dog d = new Dog();
        Zoo zoo1 = new Zoo(d);
        zoo1.animalSound();

        Cat c = new Cat();
        Zoo zoo2 = new Zoo(c);
        zoo2.animalSound();
        //List<Integer> l=new ArrayList<Integer>();


    }

}
