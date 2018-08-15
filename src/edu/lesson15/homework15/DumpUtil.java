package edu.lesson15.homework15;

import java.util.Queue;
import java.util.Random;

public class DumpUtil {

    private static final int INITIAL_PARTS_AMOUNT = 20;

    public static void fillDump(Queue<RobotParts> dump) {
        Random random = new Random();
        RobotParts[] allParts=RobotParts.values();
        for (int i = 0; i < INITIAL_PARTS_AMOUNT; i++) {
            int partNumber = random.nextInt(allParts.length);
            dump.add(allParts[partNumber]);
        }
    }
}
