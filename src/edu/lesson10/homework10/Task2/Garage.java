package edu.lesson10.homework10.Task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> equalCarCounts = new HashMap<>();

    public void park(Car car) {
        Integer count = equalCarCounts.getOrDefault(car, 0);
        equalCarCounts.put(car, count + 1);
    }

    public void leave(Car car) {
        Integer count = equalCarCounts.getOrDefault(car, 0);
        if (count > 1) {
            equalCarCounts.put(car, count - 1);
        } else {
            equalCarCounts.remove(car);
        }
    }

    public int getCount(Car car) {
        return equalCarCounts.get(car) == null ? 0 : equalCarCounts.get(car);
    }

    public int getGroupCars(Car car) {
        int sum = 0;
        for (Car key : equalCarCounts.keySet()) {
            if (car.getClass().equals(key.getClass())) {
                sum = sum + equalCarCounts.get(key);
            }
        }
        return sum;
    }
}
