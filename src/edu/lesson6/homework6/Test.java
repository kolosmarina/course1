package edu.lesson6.homework6;

public class Test {

    public static void main(String[] args) {

        Point upperLeftCorner = new Point(2, 8);
        Point bottomRightCorner = new Point(6, 4);
        Rectangle rectangle = new Rectangle(upperLeftCorner, bottomRightCorner);

        System.out.printf("Расстояние между точками: %.3f\n", upperLeftCorner.distance(bottomRightCorner));
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.printf("Длина диагонали прямоугольника: %.3f\n", rectangle.calculateDiagonalLength());
    }
}
