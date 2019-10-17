package com.company;

public class Square {
    protected int height;

    Square(int height){

        this.height= height;
    }

    public double square(){
        System.out.println("Square is work");
        return Math.pow(height,2);
    }

}
