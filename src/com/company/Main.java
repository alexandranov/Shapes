package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Reader reader = new Reader();
		System.out.println("Enter height: ");
         int height = reader.read();
		System.out.println("Enter width: ");
		int width = reader.read();



        Square square;
        if (height == width) {
            square = new Square(height);
        } else {
            square = new Rectangle(height, width);
        }

        Printer printer = new Printer();
        printer.printSquareToConsole(square);

    }
}
