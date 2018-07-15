package edu.lesson3.homework3;

import java.util.Scanner;

public class Task1Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int absoluteNumber = Math.abs(number);
        System.out.printf("Сумма цифр числа %d составляет: %d", number, sumOfDigits(absoluteNumber));
    }

    public static int sumOfDigits(int absoluteNumber) {
        int sum = 0;
        while (absoluteNumber > 0) {
            sum = sum + absoluteNumber % 10;
            absoluteNumber = absoluteNumber / 10;
        }
        return sum;
    }
}
