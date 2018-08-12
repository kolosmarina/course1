package edu.lesson15.homework15;

public class Judge {

    private Judge() {
    }

    public static String determineWinnerName(Scientist firstScientist, Scientist secondScientist) {
        String result;
        if (firstScientist.getCompletedRobotsAmount() > secondScientist.getCompletedRobotsAmount()) {
            result = firstScientist.getName() + " собрал больше роботов";
        } else if (firstScientist.getCompletedRobotsAmount() < secondScientist.getCompletedRobotsAmount()) {
            result = secondScientist.getName() + " собрал больше роботов";
        } else {
            result = firstScientist.getName() + " и " + secondScientist.getName() + " собрали одинаковое количество роботов";
        }
        return result;
    }
}
