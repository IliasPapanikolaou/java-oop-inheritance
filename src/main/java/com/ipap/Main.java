package com.ipap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Circle -----");
        Circle c1 = new Circle(5, 5, "Red", 2);
        c1.printInfo();

        System.out.println("----- Rectangle -----");
        Rectangle r1 = new Rectangle(6, 6, "Blue", 3);
        r1.moveUp(2);
        r1.printInfo();

        System.out.println("----- Shapes -----");
        Shape s1 = new Circle(2, 2, "Orange", 4);
        Shape s2 = new Circle(3, 3, "Purple", 5);
        Shape s3 = new Rectangle(2, 2, "Black", 7);
        Shape s4 = new Rectangle(4, 2, "White", 8);

        // Δυναμικός πολυμορφισμός
        // Array example
        Shape[] s = new Shape[4];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;

        for (int i = 0; i < s.length; i++) {
            if (s[i] instanceof Rectangle) {
                System.out.println("----- Rectangle ------");
            } else {
                System.out.println("----- Circle ------");
            }
            s[i].printInfo();
        }

        // ArrayList example
        List<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        shapes.add(s4);

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Εμβαδό τετραγώνου: " + shape.calcArea());
            } else if (shape instanceof Circle) {
                System.out.println("Εμβαδό κύκλου: " + shape.calcArea());
            }
        }

        // Casting
        // Α τρόπος
        shapes.forEach(shape -> {
            if (shape instanceof Rectangle) {
                ((Rectangle)shape).moveUp(10);
            }
            shape.printInfo();
        });

        // B τρόπος
        shapes.forEach(shape -> {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle)shape;
                rectangle.moveUp(10);
            }
            shape.printInfo();
        });

        // Γ τρόπος
        shapes.forEach(shape -> {
            if (shape instanceof Rectangle rectangle) {
                rectangle.moveUp(10);
            }
            shape.printInfo();
        });
    }
}