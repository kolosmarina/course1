package edu.lesson4.homework4;

public class Task2ReplaceRepeatsByZero {

    public static void main(String[] args) {
        int[] array = {8, 3, 5, 5, 2, 3, 2};

        replaceRepeatsByZero(array);

        for (int element : array) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }
    }

    private static void replaceRepeatsByZero(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }
}
