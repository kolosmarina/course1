package edu.lesson7.homework7;

public abstract class OpenTopBased implements OpenShape {
    protected Point[] tops;

    @Override
    public double calculateLength() {
        double result = 0;
        for (int i = 0; i < tops.length - 1; i++) {
            result = result + tops[i].distanceTo(tops[i + 1]);
        }
        return result;
    }
}