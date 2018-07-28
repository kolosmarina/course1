package edu.lesson7.homework7;

public abstract class ClosedTopBased extends ComparableClosedShape {
    protected Point[] tops;

    public ClosedTopBased(Point... tops) {
        this.tops = tops;
    }

    @Override
    public double calculatePerimeter() {
        double result = 0;
        for (int i = 0; i < tops.length - 1; i++) {
            result = result + tops[i].distanceTo(tops[i + 1]);
        }
        result = result + tops[tops.length - 1].distanceTo(tops[0]);
        return result;
    }

    public Point[] getTops() {
        return tops;
    }
}