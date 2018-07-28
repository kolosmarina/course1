package edu.lesson7.homework7;

import java.util.Arrays;

public class Triangle extends ClosedTopBased {
    private final double lengthFirstSide;
    private final double lengthSecondSide;
    private final double lengthThirdSide;

    public Triangle(Point... tops) {
        super(tops);
        this.lengthFirstSide = tops[0].distanceTo(tops[1]);
        this.lengthSecondSide = tops[1].distanceTo(tops[2]);
        this.lengthThirdSide = tops[2].distanceTo(tops[0]);
    }

    @Override
    public double calculateArea() {
        return (lengthFirstSide * calculateHeightOfTriangleToFirstSide()) / 2;
    }

    @Override
    public String toString() {
        return "Triangle {" + "tops = " + Arrays.toString(tops) + '}';
    }

    private double calculateHeightOfTriangleToFirstSide() {
        double halfPerimeter = calculatePerimeter() / 2;
        return ((2 * Math.sqrt(halfPerimeter * (halfPerimeter - lengthFirstSide)
                * (halfPerimeter - lengthSecondSide) * (halfPerimeter - lengthThirdSide))))
                / lengthFirstSide;
    }
}