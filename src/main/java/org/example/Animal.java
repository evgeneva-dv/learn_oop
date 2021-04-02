package org.example;
 //Принцип ООП - абстракция. У абстрактоного класса не может быть экземпляров (нельзя создать объект) - только потомки
//У асбрактного метода нет тела - этот метод нужно обязательно переопределить в потомке
//Абстрактный метод может быть только в абстрактном классе
public abstract class Animal {
    String breed;
    String pol;

    public void say (String sound) {
        System.out.println(sound);
    }
    abstract void behavior () ;

     public Animal(String breed, String pol) {
         this.breed = breed;
         this.pol = pol;
     }
 }
