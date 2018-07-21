package edu.lesson5.homework5;

public class Task1Palindrome {

    public static void main(String[] args) {

        String string = "G45an  na54g";

        System.out.println(isPalindromeString(string));
    }

    private static boolean isPalindromeString(String string) {
        boolean result = true;
        String newString = string.toLowerCase();
        int lengthOfNewString = newString.length();
        if (lengthOfNewString == 0) {
            result = false;
        }
        for (int i = 0; i < lengthOfNewString / 2; i++) {
            if (newString.charAt(i) != newString.charAt(lengthOfNewString - 1 - i)) {
                result = false;
            }
        }
        return result;
    }
}
