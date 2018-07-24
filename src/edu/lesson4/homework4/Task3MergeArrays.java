package edu.lesson4.homework4;

public class Task3MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6};

        int[] resultArray = merge(array1, array2);

        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];

        int[] shorterArray;
        int[] longerArray;
        if (array1.length >= array2.length) {
            longerArray = array1;
            shorterArray = array2;
        } else {
            longerArray = array2;
            shorterArray = array1;
        }

        int resultIndexes = 0;
        for (int j = 0; j < shorterArray.length; j++) {
            resultArray[resultIndexes] = array1[j];
            resultArray[++resultIndexes] = array2[j];
            resultIndexes++;
        }
        for (int i = shorterArray.length; i < longerArray.length; i++) {
            resultArray[resultIndexes] = longerArray[i];
            resultIndexes++;
        }
        return resultArray;
    }
}


