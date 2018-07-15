package edu.lesson2.homework2;

import java.util.Scanner;

public class Task3Discriminant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double discriminant = calculateDiscriminant(a, b, c);

        if (isPositive(discriminant)) {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения равны: " + root1 + " " + root2);
        } else if (isZero(discriminant)) {
            double root = (double) -b / (2 * a);
            System.out.println("Корень равен: " + root);
        } else {
            System.out.println("Дискриминант отрицательный.");
        }
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isZero(double number) {
        return number == 0;
    }

    public static double calculateDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}

