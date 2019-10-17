package com.company;

public class Rectangle extends Square {
    private int width;


    Rectangle(int height, int weight) {
        super(height);
        this.width = weight;

    }

    public double square() {
        System.out.println("Rectangle is work");
        return height * width;

    }

}
