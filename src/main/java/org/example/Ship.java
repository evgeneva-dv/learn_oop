package org.example;

public class Ship extends Transport{


    public final String type = "Корабль"; //final у св-ва запрещает изменить значение этой переменной

    public Ship(String model, int carrying, int speed, int costPerKm) {
        super(model, carrying, speed, costPerKm);
    }

    public void calc(double distance, float weight) {
        if (weight>getCarrying()) {
            System.out.println("Наш кораблик "+getModel() + " не сможет перевезти этот груз (максимальная масса "+getCarrying()+" км)");
        }
        else {
            System.out.println("Наш кораблик "+getModel()+" перевезет "+ weight+"кг на расстояние " +distance+"км за "+ getCostPerKm()*distance);
        }

    }
    public void swim (){
        System.out.println("Плыву");
    }

    public static boolean compareObjects (Object obj) {
        return obj instanceof Ship;
    }
}
