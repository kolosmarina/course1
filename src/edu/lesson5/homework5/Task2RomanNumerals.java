package edu.lesson5.homework5;

public class Task2RomanNumerals {
    public static void main(String[] args) {
        char[] romanNumerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabicNumerals = {1, 5, 10, 50, 100, 500, 1000};
        String string = "MCMLXXXVII";

        System.out.println(translateRomanToArabic(romanNumerals, arabicNumerals, string));
    }

    private static int translateRomanToArabic(char[] romanNumerals, int[] arabicNumerals, String string) {
        StringBuilder builder = new StringBuilder(string);
        int result = 0;
        int i = 0;
        while (i < (builder.length() - 1)) {
            int currentCharRank = 0;
            for (int j = 0; j < romanNumerals.length; j++) {
                if (builder.charAt(i) == romanNumerals[j]) {
                    currentCharRank = j;
                    break;
                }
            }
            int nextCharRank = 0;
            for (int j = 0; j < romanNumerals.length; j++) {
                if (builder.charAt(i + 1) == romanNumerals[j]) {
                    nextCharRank = j;
                    break;
                }
            }
            if (currentCharRank < nextCharRank) {
                result = result - arabicNumerals[currentCharRank] + arabicNumerals[nextCharRank];
                builder.delete(i, i + 2);
                    continue;
            }
            i = i + 1;
        }
        for (int k = 0; k < builder.length(); k++) {
            for (int j = 0; j < romanNumerals.length; j++) {
                if (builder.charAt(k) == romanNumerals[j]) {
                    result = result + arabicNumerals[j];
                    break;
                }
            }
        }
        return result;
    }
}
