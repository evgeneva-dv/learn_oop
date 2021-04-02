package org.example;

public class Dog extends Animal{
    public void behavior () {
        System.out.println("Подать лапу");
    };

    public Dog(String type, String pol) {
        super(type, pol);
    }
}
