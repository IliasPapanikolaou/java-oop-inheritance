package com.ipap;

public class Circle extends ColouredShape {

    private double r; // Ακτίνα

    // Constructor
    public Circle(double centerX, double centerY, String colour, double r) {
        super(centerX, centerY, colour);
        this.r = r;
    }

    // Getter
    public double getR() {
        return r;
    }

    // Setter
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius = " + r);
    }

    @Override
    public double calcArea() {
        return 3.14 * r * r;
    }
}
