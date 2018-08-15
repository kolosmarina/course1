package edu.lesson15.homework15;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
public class Scientist implements Runnable {

    private final List<RobotParts> parts = new ArrayList<>();
    private final List<Robot> robots = new ArrayList<>();
    @Getter
    private final String name;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " запустился поток ");
        while (!GameCycle.isGameFinished()) {
            constructRobot();

        }
    }

    public synchronized void takeOff(List<RobotParts> foundParts) {
        parts.addAll(foundParts);
    }

    private synchronized void constructRobot() {
        Iterator<RobotParts> iterator = parts.iterator();
        while (iterator.hasNext()) {
            RobotParts currentPart = iterator.next();
            for (Robot robot : robots) {
                if (!robot.isCompleteRobot() && robot.addPart(currentPart)) {
                    iterator.remove();
                    break;
                }
            }
            if (currentPart != null) {
                robots.add(new Robot(currentPart));
            }
        }
    }

    public int getCompletedRobotsAmount() {
        int result = 0;
        for (Robot robot : robots) {
            if (robot.isCompleteRobot()) {
                result++;
            }
        }
        return result;
    }
}
