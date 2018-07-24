package edu.lesson4.homework4;

public class Task1ShiftRight {

    public static void main(String[] args) {
        int[] array = {1, 7, 61, 4, 49, 22};

        shiftOneStepRight(array);

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void shiftOneStepRight(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
            if (i == 1) {
                array[0] = last;
            }
        }
    }
}
