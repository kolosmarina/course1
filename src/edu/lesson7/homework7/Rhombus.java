package edu.lesson7.homework7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Rhombus extends ClosedTopBased {
    private final double firstDiagonal;
    private final double secondDiagonal;

    public Rhombus(Point... tops) {
        super(tops);
        this.firstDiagonal = tops[0].distanceTo(tops[2]);
        this.secondDiagonal = tops[1].distanceTo(tops[3]);
    }

    @Override
    public double calculateArea() {
        BigDecimal thisFirstDiagonal = new BigDecimal(firstDiagonal);
        BigDecimal thisSecondDiagonal = new BigDecimal(secondDiagonal);
        BigDecimal numberTwo = new BigDecimal(2);
        return thisFirstDiagonal.multiply(thisSecondDiagonal)
                .divide(numberTwo, 2, RoundingMode.HALF_EVEN).doubleValue();
    }

    @Override
    public String toString() {
        return "Rhombus {" + "tops = " + Arrays.toString(tops) + '}';
    }
}
