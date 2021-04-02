package org.example;

import java.util.ArrayList;

public class EventStek <T> {

     ArrayList elems;


    public void addElem (T elem) {
        elems.add(elem);
        System.out.println(elem+ " добавлен");

    }

    public void obrabotchik() {
        System.out.println("Этот элемент сейчас будет удален "+elems.get(elems.size()-1));
        elems.remove(elems.size()-1);
    }

    public EventStek(ArrayList elems) {
        this.elems = elems;
    }

    @Override
    public String toString() {
        return "EventStek{" +
                "elems=" + elems +
                '}';
    }
}
