package com.ipap;

public class Rectangle extends ColouredShape {

    private double a;

    // Constructor
    public Rectangle(double centerX, double centerY, String colour, double a) {
        super(centerX, centerY, colour);
        this.a = a;
    }

    // Getter
    public double getA() {
        return this.a;
    }

    // Setter
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Side = " + a);
    }

    @Override
    public double calcArea() {
        return a * a;
    }

    public void moveUp(double k) {
        centerY += k;
    }

    public void moveDown(double k) {
        centerY -= k;
    }
}
