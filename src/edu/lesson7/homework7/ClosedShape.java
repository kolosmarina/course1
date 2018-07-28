package edu.lesson7.homework7;

public interface ClosedShape extends Shape {

    double calculatePerimeter();

    double calculateArea();

    boolean compareByAreaTo(ClosedShape closedShape);
}
