package org.example;

import java.util.ArrayList;

abstract class EventProcess <T> {

    protected ArrayList elems;

    public void addElem (T elem) {
        elems.add(elem);
        System.out.println(elem+ " добавлен");
    }

    public EventProcess(ArrayList elems) {
        this.elems = elems;
    }

    @Override
    public String toString() {
        return elems.toString();
    }

    abstract void process();

}
