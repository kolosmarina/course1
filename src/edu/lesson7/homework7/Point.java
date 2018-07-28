package edu.lesson7.homework7;

import java.math.BigDecimal;

public class Point extends OpenTopBased {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }

    public double distanceTo(Point point) {
        BigDecimal thisX = new BigDecimal(x);
        BigDecimal thisY = new BigDecimal(y);
        BigDecimal thatX = new BigDecimal(point.getX());
        BigDecimal thatY = new BigDecimal(point.getY());
        BigDecimal result = new BigDecimal(Math.sqrt(thisX.subtract(thatX).pow(2).add(thisY.subtract(thatY).pow(2))
                .doubleValue())).setScale(3, BigDecimal.ROUND_HALF_EVEN);
        return result.doubleValue();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
