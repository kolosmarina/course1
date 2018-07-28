package edu.lesson7.homework7;

import java.util.Arrays;

public class Multiline extends OpenTopBased {

    public Multiline(Point... tops) {
        this.tops = tops;
    }

    @Override
    public String toString() {
        return "Multiline {" + "tops = " + Arrays.toString(tops) + '}';
    }
}