package org.example;

public class Transport {
    private String model;
    private float carrying;
    private int speed;
    private double costPerKm;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCarrying() {
        return carrying;
    }

    public void setCarrying(float carrying) {
        this.carrying = carrying;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    public Transport(String model, int carrying, int speed, int costPerKm) {
        this.model = model;
        this.carrying = carrying;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public void calc(double distance, float weight) {
        if (weight>getCarrying()) {
            System.out.println(getModel() + " не сможет перевезти этот груз (превышена масса)");
        }
        else {
            System.out.println(getModel()+" перевезет "+ weight+"кг на расстояние " +distance+"км за "+ getCostPerKm()*distance);
        }

    }
}
