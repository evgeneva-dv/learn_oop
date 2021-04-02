package org.example;

import java.util.ArrayList;

public class EventQueueRefact extends EventProcess {
    public EventQueueRefact(ArrayList elems) {
        super(elems);
    }

    @Override
    void process() {
        System.out.println("Этот элемент сейчас будет удален "+elems.get(1));
        elems.remove(elems.get(0));
    }
}
