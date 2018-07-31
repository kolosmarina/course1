package edu.lesson7.homework7;

public abstract class ComparableClosedShape implements ClosedShape {

    @Override
    public boolean compareByAreaTo(ClosedShape closedShape) {
        return calculateArea() == closedShape.calculateArea();
    }
}
