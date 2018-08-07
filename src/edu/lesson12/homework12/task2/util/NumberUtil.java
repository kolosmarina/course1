package edu.lesson12.homework12.task2.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberUtil {

    private static Random random = new Random();

    public static List<Integer> generateRandomIntegers(int count, int range) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(random.nextInt(range));
        }
        return result;
    }
}
