package edu.lesson4.homework4;

public class Task4ArrayLinearization {

    public static void main(String[] args) {
        int[][] array = {{1, 6, 9}, {22, 33, 44, 55, 66}};

        int[] resultArray = linearize(array);

        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] linearize(int[][] array) {
        int lengthOfResultArray = 0;
        for (int[] secondLevelArray : array) {
            lengthOfResultArray += secondLevelArray.length;
        }
        int[] resultArray = new int[lengthOfResultArray];
        int resultIndex = 0;
        for (int[] secondLevelArray : array) {
            for (int secondLevelArrayElement : secondLevelArray) {
                resultArray[resultIndex] = secondLevelArrayElement;
                resultIndex = resultIndex + 1;
            }
        }
        return resultArray;
    }
}
