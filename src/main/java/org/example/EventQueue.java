package org.example;

import java.util.ArrayList;

public class EventQueue <T> {

    ArrayList elems;


    public void addElem (T elem) {
        elems.add(elem);
        System.out.println(elem+ " добавлен");
    }

    public void obrabotchik() {
        System.out.println("Этот элемент сейчас будет удален "+elems.get(1));
        elems.remove(elems.get(0));
    }

    public EventQueue(ArrayList elems) {
        this.elems = elems;
    }

    @Override
    public String toString() {
        return "EventQueue{" +
                "elems=" + elems +
                '}';
    }
}
