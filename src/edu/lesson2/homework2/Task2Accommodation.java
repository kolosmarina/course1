package edu.lesson2.homework2;

import java.util.Scanner;

public class Task2Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = 10;
        int f = 10;
        String negativeResult = "Дома не помещаются на участке.";
        String positiveResult = "Дома помещаются на участве.";

        int maxSideOfHouses = Math.max(Math.max(a, b), Math.max(c, d));
        int maxSideOfArea = Math.max(e, f);
        if (maxSideOfArea < maxSideOfHouses) {
            System.out.println(negativeResult);
        } else {
            int sumOfMinSides = Math.min(a, b) + Math.min(c, d);
            if (sumOfMinSides > Math.min(e, f)) {
                System.out.println(negativeResult);
            } else {
                System.out.println(positiveResult);
            }
        }
    }
}
