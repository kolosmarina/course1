package edu.lesson18.homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinutesSpentReportGenerator implements ReportGenerator {

    private static final String EXERCISE = "Упражнения";
    private static final String BREAK = "Перерыв";
    private static final String LUNCH = "Обеденный перерыв";
    private static final String FOUNDING = "Решения";
    private static final String LECTURES = "Лекции";
    private static final String COLON = ":";
    private static final String PERCENT = "%";
    private static final int MINUTES_IN_HOUR = 60;
    private static final int PERCENTAGE_RATIO = 100;

    private Integer dayLength;

    @Override
    public List<String> generateReport(List<Map<String, String>> list) {
        List<String> report = new ArrayList<>();
        for (Map<String, String> dayMap : list) {
            Map<String, Integer> activityMinutesMap = getActivityMap(dayMap);
            Integer lectureMinutes = 0;
            List<String> lecturesList = new ArrayList<>();
            for (Map.Entry<String, Integer> activityEntry : activityMinutesMap.entrySet()) {
                switch (activityEntry.getKey()) {
                    case EXERCISE:
                    case BREAK:
                    case LUNCH:
                    case FOUNDING:
                        report.add(getActivityLine(activityEntry.getKey(), activityEntry.getValue(), dayLength));
                        break;
                    default:
                        lectureMinutes += activityEntry.getValue();
                        lecturesList.add(getActivityLine(activityEntry.getKey(), activityEntry.getValue(), dayLength));
                        break;
                }
            }
            report.add(getActivityLine(LECTURES, lectureMinutes, dayLength));
            report.add(EMPTY_LINE);
            report.add(LECTURES + COLON);
            report.addAll(lecturesList);
            report.add(EMPTY_LINE);
        }
        return report;
    }

    private Map<String, Integer> getActivityMap(Map<String, String> parsedDay) {
        Map<String, Integer> activityMinutesMap = new HashMap<>();
        Map.Entry<String, String> previousEntry = null;
        String startDay = null;
        String endDay = null;
        for (Map.Entry<String, String> entry : parsedDay.entrySet()) {
            if (previousEntry == null) {
                previousEntry = entry;
                startDay = entry.getKey();
                continue;
            }
            endDay = entry.getKey();
            Integer minutes = calculateMinutes(entry.getKey(), previousEntry.getKey());
            activityMinutesMap.compute(previousEntry.getValue(), (k, v) -> v == null ? minutes : v + minutes);
            previousEntry = entry;
        }

        /*Iterator<Map.Entry<String, String>> iterator = parsedDay.entrySet().iterator();
        String startDay = null;
        String endDay = null;
        while (iterator.hasNext()) {
            Map.Entry<String, String> currentEntry = iterator.next();
            if (previousEntry == null) {
                previousEntry = currentEntry;
                startDay = currentEntry.getKey();
                continue;
            }
            endDay = currentEntry.getKey();
            Integer minutes = calculateMinutes(currentEntry.getKey(), previousEntry.getKey());
            activityMinutesMap.compute(previousEntry.getValue(), (k, v) -> v == null ? minutes : v + minutes);
            previousEntry = currentEntry;
        }*/

        dayLength = calculateMinutes(endDay, startDay);
        return activityMinutesMap;
    }

    private String getActivityLine(String activityType, Integer activityMinutes, Integer dayLength) {
        StringBuilder lineBuilder = new StringBuilder(activityType);
        lineBuilder.append(COLON + SPACE)
                .append(activityMinutes)
                .append(" минут ")
                .append(String.format("%.1f", (double) (activityMinutes * PERCENTAGE_RATIO) / dayLength))
                .append(PERCENT);
        return lineBuilder.toString();
    }

    private Integer calculateMinutes(String endTime, String startTime) {
        Integer endTimeMinutes = toMinutes(endTime);
        Integer startTimeMinutes = toMinutes(startTime);
        return endTimeMinutes - startTimeMinutes;
    }

    private Integer toMinutes(String time) {
        String[] tempParts = time.split(COLON);
        Integer hours = Integer.valueOf(tempParts[0]);
        Integer minutes = Integer.valueOf(tempParts[1]);
        return hours * MINUTES_IN_HOUR + minutes;
    }
}
