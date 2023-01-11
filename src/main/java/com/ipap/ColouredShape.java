package com.ipap;

public abstract class ColouredShape extends Shape {

    private String colour;

    // Constructor
    public ColouredShape(double centerX, double centerY, String colour) {
        super(centerX, centerY);
        this.colour = colour;
    }

    // Getter
    public String getColour() {
        return colour;
    }

    // Setter
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Colour = " + colour);
    }
}
