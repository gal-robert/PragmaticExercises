package org.example;

public class AreaOfARectangularRoom {
    public static void main(String[] args) {
        Area test = new Area(15,20);
    }
}

class Area {
    private double width;
    private double length;
    private double feetSquare;
    private double meterSquare;
    final private double CONVERSION_FACTOR = 0.09290304;

    public Area(int width, int length) {
        this.width = width;
        this.length = length;

        this.exec();
    }

    public void exec() {
        this.calc(this.width, this.length);
        this.print();
    }

    private void calc(double x, double y) {
        this.feetSquare = x * y;
        this.meterSquare = feetSquare * CONVERSION_FACTOR;
    }

    public void print() {
        System.out.println("The area is:");
        System.out.println("   " + this.feetSquare + " square feet");
        System.out.println("   " + this.meterSquare + " square meters");
    }
}