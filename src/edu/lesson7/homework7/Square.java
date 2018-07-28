package edu.lesson7.homework7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Square extends ClosedTopBased {

    public Square(Point... tops) {
        super(tops);
    }

    @Override
    public double calculateArea() {
        BigDecimal lengthSide = new BigDecimal(tops[0].distanceTo(tops[1]));
        return lengthSide.pow(2).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    @Override
    public String toString() {
        return "Square {" + "tops = " + Arrays.toString(tops) + '}';
    }
}
