package edu.lesson2.homework2;

import java.util.Scanner;

public class Task1NextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (day == 31 && month == 12) {
            System.out.println(increaseYear(year));
        } else if ((month > 12 || month <= 0 || year <= 0) || isDayNotInMonth(day, month, year)) {
            System.out.println("Дата введена некорректно.");
        } else if (isEndOfMonth(day, month, year)) {
            System.out.println(increaseMonth(month, year));
        } else {
            System.out.println(increaseDay(day, month, year));
        }
    }

    public static String formatDate(int day, int month, int year) {
        return String.format("%s.%s.%s", day, month, year);
    }

    public static String increaseYear(int year) {
        return formatDate(1, 1, year + 1);
    }

    public static String increaseMonth(int month, int year) {
        return formatDate(1, month + 1, year);
    }

    public static String increaseDay(int day, int month, int year) {
        return formatDate(day + 1, month, year);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isEndOfMonth(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                return day == 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return day == 30;
            case 2:
                if (isLeapYear(year)) {
                    return day == 29;
                } else {
                    return day == 28;
                }
            default:
                return false;
        }
    }

    public static boolean isDayNotInMonth(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                return day <= 0 || day >= 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 31;
            case 2:
                if (isLeapYear(year)) {
                    return day >= 30;
                } else {
                    return day >= 29;
                }
            default:
                return false;
        }
    }
}


