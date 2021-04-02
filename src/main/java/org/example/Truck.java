package org.example;

public class Truck extends Transport{

    int Height;

    public Truck(String model, int carrying, int speed, int costPerKm, int height) {
        super(model, carrying, speed, costPerKm);
        Height = height;
    }

    public void drive(){
        System.out.println("Еду");
    }

}
