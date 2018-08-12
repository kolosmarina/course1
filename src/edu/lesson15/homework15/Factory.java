package edu.lesson15.homework15;

import java.util.Queue;
import java.util.Random;

public class Factory implements Runnable {

    private static final int MAX_PARTS_AMOUNT = 4;
    private static final int PARTS_INITIAL_AMOUNT = 9;
    private Random random = new Random();
    private final Queue<RobotParts> dump;

    public Factory(Queue<RobotParts> dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " запустился поток.");
        while (!GameCycle.isGameFinished()) {
            synchronized (GameCycle.night) {
                try {
                    System.out.println(name + " ожидает...");
                    GameCycle.night.wait();
                    System.out.println(name + " запустился.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int amountOfParts = random.nextInt(MAX_PARTS_AMOUNT) + 1;
                for (int i = 0; i < amountOfParts; i++) {
                    int partNumber = random.nextInt(Factory.PARTS_INITIAL_AMOUNT);
                    RobotParts currentPart = RobotParts.values()[partNumber];
                    synchronized (dump) {
                        dump.add(currentPart);
                    }
                    System.out.println(name + " выбросил на свалку " + currentPart);
                }
                System.out.println(name + " выбросил на свалку " + amountOfParts);
            }
        }
    }
}
