package org.example;

import java.util.ArrayList;

public class EventStekRefact extends EventProcess {

    public EventStekRefact(ArrayList elems) {
        super(elems);
    }

    @Override
    void process() {
        System.out.println("Этот элемент сейчас будет удален "+elems.get(elems.size()-1));
         elems.remove(elems.size()-1);

    }
}
