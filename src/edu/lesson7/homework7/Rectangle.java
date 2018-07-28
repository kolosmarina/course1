package edu.lesson7.homework7;

import java.util.Arrays;

public class Rectangle extends ClosedTopBased {

    public Rectangle(Point... tops) {
        super(tops);
    }

    @Override
    public double calculateArea() {
        return tops[0].distanceTo(tops[1]) * tops[1].distanceTo(tops[2]);
    }

    @Override
    public String toString() {
        return "Rectangle {" + "tops = " + Arrays.toString(tops) + '}';
    }
}