package com.practice;

public class Zoo {
    Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    public void animalSound() {
        animal.makeSound();
    }
}
