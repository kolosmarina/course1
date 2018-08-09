package edu.lesson12.homework12.task2;

import edu.lesson12.homework12.task2.util.FileUtil;
import edu.lesson12.homework12.task2.util.NumberUtil;

import java.io.File;
import java.util.List;
import java.util.Set;

public class RandomNumbersFileSortingDemo {

    public static void main(String[] args) {
        List<Integer> randomIntegers = NumberUtil.generateRandomIntegers(50, 1000);
        File file = FileUtil.writeToFile(randomIntegers, "Numbers.txt");
        Set<Integer> sorted = FileUtil.sortAscending(file);
        //FileUtil.writeToFile(sorted, "Numbers.txt");
        //System.out.println(sorted);
        FileUtil.writeToTextFile(sorted, file);
    }
}
