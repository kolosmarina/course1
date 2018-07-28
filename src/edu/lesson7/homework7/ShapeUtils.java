package edu.lesson7.homework7;

import java.math.BigDecimal;

public class ShapeUtils {

    public static boolean isRectangle(ClosedTopBased shape) {
        Point[] tops = shape.getTops();

        if (tops.length != 4) {
            return false;
        }

        double firstSide = tops[0].distanceTo(tops[1]);
        double secondSide = tops[1].distanceTo(tops[2]);
        double thirdSide = tops[2].distanceTo(tops[3]);
        double fourthSide = tops[3].distanceTo(tops[0]);

        if (firstSide != thirdSide || secondSide != fourthSide) {
            return false;
        }

        double firstDiagonal = tops[0].distanceTo(tops[2]);
        double secondDiagonal = tops[1].distanceTo(tops[3]);

        return isTriangleRectangular(firstSide, secondSide, firstDiagonal)
                && isTriangleRectangular(secondSide, thirdSide, secondDiagonal);
    }

    public static boolean isTriangle(ClosedTopBased shape) {
        Point[] tops = shape.getTops();

        if (tops.length != 3) {
            return false;
        }

        double firstSide = tops[0].distanceTo(tops[1]);
        double secondSide = tops[1].distanceTo(tops[2]);
        double thirdSide = tops[2].distanceTo(tops[0]);

        return firstSide < (secondSide + thirdSide)
                && secondSide < (thirdSide + firstSide)
                && thirdSide < (secondSide + firstSide);
    }

    private static boolean isTriangleRectangular(double firstCatheter, double secondCatheter, double hypotenuse) {
        BigDecimal thisFirstCatheter = new BigDecimal(firstCatheter);
        BigDecimal thisSecondCatheter = new BigDecimal(secondCatheter);
        BigDecimal thisHypotenuse = new BigDecimal(hypotenuse);
        BigDecimal sum = thisFirstCatheter.pow(2).add(thisSecondCatheter.pow(2))
                .setScale(1, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal hyp = thisHypotenuse.pow(2).setScale(1, BigDecimal.ROUND_HALF_EVEN);
        return sum.equals(hyp);
    }
}