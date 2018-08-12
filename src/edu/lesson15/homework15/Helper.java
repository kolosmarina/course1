package edu.lesson15.homework15;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Helper implements Runnable {

    private static final int MAX_PARTS_AMOUNT = 4;
    private Random random = new Random();
    private final Scientist scientist;
    private final Queue<RobotParts> dump;

    public Helper(Queue<RobotParts> dump, Scientist scientist) {
        this.dump = dump;
        this.scientist = scientist;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " запустился поток ");
        while (!GameCycle.isGameFinished()) {
            synchronized (GameCycle.night) {
                try {
                    System.out.println(name + " ожидает...");
                    GameCycle.night.wait();
                    System.out.println(name + " дождался");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int numberOfParts = random.nextInt(MAX_PARTS_AMOUNT);
                List<RobotParts> foundParts = new ArrayList<>(MAX_PARTS_AMOUNT);
                for (int i = 0; i <= numberOfParts; i++) {
                    RobotParts robotPart;
                    synchronized (dump) {
                        robotPart = dump.poll();
                    }
                    if (robotPart != null) {
                        foundParts.add(robotPart);
                    }
                }
                System.out.println(name + " отдал " + foundParts);
                scientist.takeOff(foundParts);
            }
        }
    }
}
