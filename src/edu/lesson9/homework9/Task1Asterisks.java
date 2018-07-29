package edu.lesson9.homework9;

import java.util.ArrayList;
import java.util.List;

public class Task1Asterisks {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");

        markLength4(words);

        System.out.println(words.toString());
    }

    private static void markLength4(List<String> words) {
        int i = 0;
        while (i < words.size()) {
            if (words.get(i).length() == 4) {
                words.add(i, "****");
                i = i + 2;
            } else {
                i = i + 1;
            }
        }
    }
}

