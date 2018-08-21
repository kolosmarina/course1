package edu.lesson18.homework18;

import java.util.List;
import java.util.Map;

public interface ReportGenerator {

    String EMPTY_LINE = "";
    String SPACE = " ";

    List<String> generateReport(List<Map<String, String>> parsedFile);
}
