package edu.lesson15.homework15;

import java.util.HashSet;
import java.util.Set;

public class Robot {

    private static final int AMOUNT_COMPLETE_ROBOT_PARTS = 9;
    private Set<RobotParts> parts = new HashSet<>();

    public Robot(RobotParts part) {
        parts.add(part);
    }

    public boolean isCompleteRobot() {
        return parts.size() == AMOUNT_COMPLETE_ROBOT_PARTS;
    }

    public boolean addPart(RobotParts part) {
        return parts.add(part);
    }
}
