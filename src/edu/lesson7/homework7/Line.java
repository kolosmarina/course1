package edu.lesson7.homework7;

import java.util.Arrays;

public class Line extends OpenTopBased {

    public Line(Point top1, Point top2) {
        this.tops = new Point[2];
        this.tops[0] = top1;
        this.tops[1] = top2;
    }

    @Override
    public String toString() {
        return "Line {" + "tops = " + Arrays.toString(tops) + '}';
    }
}