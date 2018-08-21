package edu.lesson18.homework18;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class ReportDemo {

    public static void main(String[] args) {
        Path sourceFilePath = Paths.get("src", "edu", "lesson18", "homework18", "file", "schedule.txt");
        List<Map<String, String>> parsedFile = null;
        try {
            parsedFile = FileParseUtil.getList(sourceFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        ReportGenerator generator = new TimeIntervalReportGenerator();
        List<String> timeIntervalReport = generator.generateReport(parsedFile);

        Path intervalReportPath = Paths.get("src", "edu", "lesson18", "homework18", "file",
                "time interval report.txt");
        try {
            ReportWriteUtil.writeTo(intervalReportPath, timeIntervalReport);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReportGenerator minutesGenerator = new MinutesSpentReportGenerator();
        List<String> minutesReport = minutesGenerator.generateReport(parsedFile);
        Path minutesSpentReportPath = Paths.get("src", "edu", "lesson18", "homework18", "file",
                "time statistics report.txt");
        try {
            ReportWriteUtil.writeTo(minutesSpentReportPath, minutesReport);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
