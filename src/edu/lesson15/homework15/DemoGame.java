package edu.lesson15.homework15;

import java.util.LinkedList;
import java.util.Queue;

public class DemoGame {

    public static void main(String[] args) {
        Scientist firstScientist = new Scientist("Первый ученый");
        Thread firstScientistThread = new Thread(firstScientist);
        firstScientistThread.setName("Работа первого ученого");
        Scientist secondScientist = new Scientist("Второй ученый");
        Thread secondScientistThread = new Thread(secondScientist);
        secondScientistThread.setName("Работа второго ученого");
        firstScientistThread.start();
        secondScientistThread.start();

        Queue<RobotParts> dump = new LinkedList<>();
        DumpUtil.fillDump(dump);

        Thread firstHelperThread = new Thread(new Helper(dump, firstScientist));
        firstHelperThread.setName("Помощник первого ученого");
        Thread secondHelperThread = new Thread(new Helper(dump, secondScientist));
        secondHelperThread.setName("Помощник второго ученого");
        firstHelperThread.start();
        secondHelperThread.start();
        Thread factoryThread = new Thread(new Factory(dump));
        factoryThread.setName("Фабрика");
        factoryThread.start();

        GameCycle.startGameCycles();
        try {
            factoryThread.join();
            firstHelperThread.join();
            secondHelperThread.join();
            firstScientistThread.join();
            secondScientistThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Первый ученый собрал: " + firstScientist.getCompletedRobotsAmount() + " роботов.");
        System.out.println("Второй ученый собрал:  " + secondScientist.getCompletedRobotsAmount() + " роботов.");
        System.out.println(Judge.determineWinnerName(firstScientist, secondScientist));
    }
}
