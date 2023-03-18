package com.objectOriented;

public class Dog extends Animal1{
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says:  goo goo");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Pig object
        myDog.animalSound();// The pig says:  goo goo
        myDog.sleep();// Zzz
    }
}
