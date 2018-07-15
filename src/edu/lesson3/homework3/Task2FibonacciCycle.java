package edu.lesson3.homework3;

import java.util.Scanner;

public class Task2FibonacciCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.print(number);
        } else if (number < 0) {
            System.out.printf("Сумма чисел Фибоначи не может быть %d", number);
        } else {
            calculateAndPrintFibonacciNumbers(number);
        }
    }

    public static void calculateAndPrintFibonacciNumbers(int number) {
        int previous = 0;
        int current = 1;
        int next;
        System.out.printf("%d %d ", previous, current);
        for (; current < number; ) {
            next = current + previous;
            if (next < number) {
                System.out.printf("%d ", next);
            } else {
                break;
            }

            previous = current;
            current = next;
        }
    }
}
