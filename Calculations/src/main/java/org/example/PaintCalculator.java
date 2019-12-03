package org.example;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Calculator test = new Calculator();
    }
}

// 1 gallon = 350 f^2

class Calculator {
    private int width;
    private int length;
    private final double SURFACE_PER_GALLON = 350.0;

    public Calculator() {
        exec();
    }

    public void exec() {
        getLength();
        getWidth();
        printResult();
    }

    private void getWidth() {
        System.out.println("Width of the ceiling: ");
        Scanner width = new Scanner(System.in);
        this.width = width.nextInt();
    }

    private void getLength() {
        System.out.println("Width of the ceiling: ");
        Scanner length = new Scanner(System.in);
        this.length = length.nextInt();
    }

    private int calculateSurface() {
        return this.width * this.length;
    }

    private double calculatePaint() {
        int surface = calculateSurface();
        return Math.ceil(surface / SURFACE_PER_GALLON);
    }

    private void printResult() {
        System.out.println("You will nee to purchase " + calculatePaint() +
        " gallons of paint to cover " + calculateSurface() + " sqare feet");
    }

}