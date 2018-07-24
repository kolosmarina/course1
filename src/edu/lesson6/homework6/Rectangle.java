package edu.lesson6.homework6;

public class Rectangle {

    private Point firstCorner;
    private Point secondCorner;

    public Rectangle(Point firstCorner, Point secondCorner) {
        this.firstCorner = firstCorner;
        this.secondCorner = secondCorner;
    }

    public int calculateArea() {
        return Math.abs((firstCorner.getX() - secondCorner.getX()) * (firstCorner.getY() - secondCorner.getY()));
    }

    public double calculateDiagonalLength() {
        return Math.sqrt(Math.pow((firstCorner.getX() - secondCorner.getX()), 2)
                + Math.pow((firstCorner.getY() - secondCorner.getY()), 2));
    }
}
