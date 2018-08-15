package edu.lesson15.homework15;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Factory implements Runnable {

    private static final int MAX_PARTS_AMOUNT = 4;
    private final Queue<RobotParts> dump;

    public Factory(Queue<RobotParts> dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " запустился поток.");
        Random random = new Random();
        while (!GameCycle.isGameFinished()) {
            synchronized (GameCycle.getNIGHT()) {
                try {
                    System.out.println(name + " ожидает...");
                    GameCycle.getNIGHT().wait();
                    System.out.println(name + " запустился.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int amountOfParts = random.nextInt(MAX_PARTS_AMOUNT) + 1;
                RobotParts[] allParts = RobotParts.values();
                List<RobotParts> newParts = new ArrayList<>(amountOfParts);
                for (int i = 0; i < amountOfParts; i++) {
                    int partNumber = random.nextInt(allParts.length);
                    RobotParts currentPart = allParts[partNumber];
                    newParts.add(currentPart);
                }
                synchronized (dump) {
                    dump.addAll(newParts);
                    System.out.println(name + " выбросил на свалку " + newParts);
                }
                System.out.println(name + " выбросил на свалку " + amountOfParts);
            }
        }
    }
}
