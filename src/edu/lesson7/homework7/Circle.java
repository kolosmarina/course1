package edu.lesson7.homework7;

import java.math.BigDecimal;

public class Circle extends ClosedCenterBased {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public double calculatePerimeter() {
        BigDecimal thisRadius = new BigDecimal(radius);
        return (new BigDecimal(2)).multiply(new BigDecimal(Math.PI)).multiply(thisRadius)
                .setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    @Override
    public double calculateArea() {
        BigDecimal thisRadius = new BigDecimal(radius);
        return (new BigDecimal(Math.PI)).multiply(thisRadius.pow(2))
                .setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    @Override
    public String toString() {
        return "Circle {" + "radius = " + radius + '}';
    }
}
