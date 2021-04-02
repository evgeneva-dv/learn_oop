package org.example;

// приницип ООП - наследование (потомок класса транспорт)
public class Plane extends Transport{

    //принцип полиморфизм - можно переопределить или добавить св-ва или методы потомка
    int maxHeight;

    public void calc(double distance, float weight) {
        System.out.print("Самолетик ");
        super.calc(distance,weight);

    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public Plane(String model, int carrying, int speed, int costPerKm, int maxHeight) {
        super(model, carrying, speed, costPerKm);
        this.maxHeight = maxHeight;
    }

    public Plane(String model, int carrying, int speed, int costPerKm) {
        super(model, carrying, speed, costPerKm);
    }

    public void fly() {
        System.out.println("Я лечу");
    }
}
