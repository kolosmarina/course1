package edu.lesson15.homework15;

public class GameCycle {

    public final static Object night = new Object();
    private static int nightCounter;
    private static final int TOTAL_NIGHT_COUNTER = 100;
    private static final int DAY_LENGTH = 100;

    public static boolean isGameFinished() {
        return nightCounter == TOTAL_NIGHT_COUNTER;
    }

    public static void startGameCycles() {
        while (nightCounter < TOTAL_NIGHT_COUNTER) {
            try {
                Thread.sleep(DAY_LENGTH);
                nightCounter++;
                System.out.println("Пришла ночь под номером " + nightCounter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (night) {
                night.notifyAll();
            }
        }
    }
}
