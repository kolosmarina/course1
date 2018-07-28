package edu.lesson7.homework7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ellipse extends ClosedCenterBased {
    private int secondRadius;

    public Ellipse(int radius, int secondRadius) {
        super(radius);
        this.secondRadius = secondRadius;
    }

    @Override
    public double calculatePerimeter() {
        BigDecimal thisRadius = new BigDecimal(radius);
        BigDecimal thisSecondRadius = new BigDecimal(secondRadius);
        return (new BigDecimal(4)).multiply((new BigDecimal(Math.PI)).multiply(thisRadius).multiply(thisSecondRadius)
                .add(thisRadius.subtract(thisSecondRadius).pow(2)))
                .divide(thisRadius.add(thisSecondRadius), 2, RoundingMode.HALF_EVEN).doubleValue();
    }

    @Override
    public double calculateArea() {
        BigDecimal thisRadius = new BigDecimal(radius);
        BigDecimal thisSecondRadius = new BigDecimal(secondRadius);
        return (new BigDecimal(Math.PI)).multiply(thisRadius).multiply(thisSecondRadius)
                .setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    @Override
    public String toString() {
        return "Ellipse {" + "radius = " + radius + ", secondRadius = " + secondRadius + '}';
    }
}