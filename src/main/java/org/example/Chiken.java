package org.example;

public class Chiken extends Animal{

    public Chiken(String breed, String pol) {
        super(breed, pol);
    }

    @Override
    void behavior() {
        System.out.println("Бегать и кудахтать");

    }
}
