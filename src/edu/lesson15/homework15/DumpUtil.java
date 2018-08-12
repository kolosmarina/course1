package edu.lesson15.homework15;

import java.util.Queue;
import java.util.Random;

public class DumpUtil {

    private static final int INITIAL_PARTS_AMOUNT = 20;
    private static final int DIFFERENT_PARTS_AMOUNT = 9;

    public static void fillDump(Queue<RobotParts> dump) {
        Random random = new Random();
        for (int i = 0; i < INITIAL_PARTS_AMOUNT; i++) {
            int partNumber = random.nextInt(DIFFERENT_PARTS_AMOUNT);
            dump.add(RobotParts.values()[partNumber]);
        }
    }
}
