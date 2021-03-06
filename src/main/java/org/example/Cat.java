package org.example;
//Принцип ООП - инкапсуляция. Код разбиваем на классы ( и задаем урони доступа)
public class Cat {
    String name;
    int age;
    int weight;
    boolean isAngry;

    static int count=1;

    public Cat(String name, int age, int weight, boolean isAngry) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isAngry = isAngry;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(){
        this.name = "Неизвестный кот " +count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
