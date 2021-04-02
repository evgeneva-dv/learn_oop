package org.example;

public class Box{
    int height;
    int wight;
    int depth;

    public Box(int height, int wight, int depth) throws ExceptionHeight {

        if (height<0||wight<0||depth<0) throw new ExceptionHeight("Размер отрицательный ",height,wight,depth);


        this.height = height;
        this.wight = wight;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                '}';
    }
}
