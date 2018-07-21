package edu.lesson4.homework4;

public class Task2RemovalOfRepeats {

    public static void main(String[] args) {
        int[] array = {3, 6, 3, 8, 5, 2, 8};

        int amountOfRepeats = calculateAmountOfRepeats(array);
        int[] resultArray;
        if (amountOfRepeats > 0) {
            int[] repeatsIndexes = getRepeatsIndexes(array, amountOfRepeats);
            sortAscending(repeatsIndexes);
            resultArray = fillArrayWithoutRepeats(array, repeatsIndexes, amountOfRepeats);
        } else {
            resultArray = array;
        }
        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

    private static int calculateAmountOfRepeats(int[] array) {
        int amountOfRepeats = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    amountOfRepeats = amountOfRepeats + 1;
                    break;
                }
            }
        }
        return amountOfRepeats;
    }

    private static int[] getRepeatsIndexes(int[] array, int amountOfRepeats) {
        int[] indexes = new int[amountOfRepeats];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    indexes[index] = j;
                    index = index + 1;
                    break;
                }
            }
        }
        return indexes;
    }

    private static void sortAscending(int[] indexes) {
        for (int i = 0; i < indexes.length - 1; i++) {
            for (int j = i + 1; j < indexes.length; j++) {
                if (indexes[i] > indexes[j]) {
                    int temp = indexes[j];
                    indexes[j] = indexes[i];
                    indexes[i] = temp;
                }
            }
        }
    }

    private static int[] fillArrayWithoutRepeats(int[] array, int[] indexes, int amountOfRepeats) {
        int[] resultArray = new int[array.length - amountOfRepeats];
        int indexForNewArray = 0;
        int indexForIndexes = 0;
        for (int j = 0; j < array.length; j++) {
            if (j == indexes[indexForIndexes]) {
                if (indexForIndexes < indexes.length - 1) {
                    indexForIndexes = indexForIndexes + 1;
                }
                continue;
            }
            resultArray[indexForNewArray] = array[j];
            indexForNewArray = indexForNewArray + 1;
        }
        return resultArray;
    }
}

