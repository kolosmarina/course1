package edu.lesson10.homework10.Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public final class FrequencyUtil {

    private FrequencyUtil() {
    }

    public static Map<String, BigDecimal> calculateFrequency(String line) {
        String[] arrayWords = line.split(" ");
        BigDecimal sizeArray = BigDecimal.valueOf(arrayWords.length);
        BigDecimal oneWordFrequency = BigDecimal.valueOf(1).divide(sizeArray, 2, RoundingMode.HALF_EVEN);
        Map<String, BigDecimal> hashMap = new HashMap<>();
        for (int i = 0; i < sizeArray.intValue(); i++) {
            BigDecimal frequency = hashMap.get(arrayWords[i]);
            if (frequency == null) {
                hashMap.put(arrayWords[i], oneWordFrequency);
            } else {
                hashMap.put(arrayWords[i], frequency.add(oneWordFrequency));
            }
        }
        return hashMap;
    }
}
