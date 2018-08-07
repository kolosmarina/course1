package edu.lesson12.homework12.task1;

import edu.lesson12.homework12.task1.Util.FileUtil;
import edu.lesson12.homework12.task1.Util.LettersUtil;

import java.util.Map;

public class LetterCalculation {

    public static void main(String[] args) {
        Map<Character, Integer> letters = LettersUtil.calculateLetters("Poem.txt");
        FileUtil.printToFile(letters, "Result.txt");
    }
}
