package edu.lesson3.homework3;

import java.util.Scanner;

public class Task3Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int days = scanner.nextInt();
        int precipitation;
        int sumPrecipitation = 0;
        int maxPrecipitation = 0;
        for (int i = 1; i <= days; i++) {
            System.out.printf("Введите величину осадков в %d день: ", i);
            precipitation = scanner.nextInt();
            sumPrecipitation = sumPrecipitation + precipitation;
            if (precipitation > maxPrecipitation) {
                maxPrecipitation = precipitation;
            }
        }
        double averageOfPrecipitation = (double) sumPrecipitation / days;
        System.out.println("Количество дней равно: " + days);
        System.out.println("Сумма осадков за данный период составляет: " + sumPrecipitation);
        System.out.println("Среднее количество осадков за данный период равно: " + averageOfPrecipitation);
        System.out.println("Максимальное количество дневных осадков за данный период равно: " + maxPrecipitation);
    }
}

