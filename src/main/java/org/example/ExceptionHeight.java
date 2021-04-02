package org.example;

public class ExceptionHeight extends Exception {
    int height;
    int wight;
    int depth;

    public ExceptionHeight(String message, int height, int wight, int depth) {
        super(message);
        this.height = height;
        this.wight=wight;
        this.depth=depth;
    }
}
