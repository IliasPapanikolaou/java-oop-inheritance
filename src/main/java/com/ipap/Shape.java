package com.ipap;

public abstract class Shape {

    protected double centerX; // X στο καρτεσιανό επίπεδο
    protected double centerY; // Y στο καρτεσιανό επίπεδο

    // Constructor
    public Shape(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    // Getters
    public double getCenterX() {
        return this.centerX;
    }

    public double getCenterY() {
        return this.centerY;
    }

    // Setters
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void printInfo() {
        System.out.println("Center = (" + this.centerX + "," + this.centerY + ")");
    }

    public abstract double calcArea();
}
