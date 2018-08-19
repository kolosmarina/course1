package edu.lesson18.homework18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TimeIntervalReportGenerator implements ReportGenerator {

    private static final String DASH = "-";

    @Override
    public List<String> generateReport(List<Map<String, String>> list) {
        List<String> report = new ArrayList<>();
        for (Map<String, String> dayMap : list) {
            Map.Entry<String, String> previousEntry = null;
            Iterator<Map.Entry<String, String>> iterator = dayMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> currentEntry = iterator.next();
                if (previousEntry == null) {
                    previousEntry = currentEntry;
                    continue;
                }
                report.add(getReportLine(previousEntry, currentEntry));
                previousEntry = currentEntry;
            }
            report.add(EMPTY_LINE);
        }
        return report;
    }

    private String getReportLine(Map.Entry<String, String> previousEntry, Map.Entry<String, String> currentEntry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(previousEntry.getKey())
                .append(DASH)
                .append(currentEntry.getKey())
                .append(SPACE)
                .append(previousEntry.getValue());
        return stringBuilder.toString();
    }
}
