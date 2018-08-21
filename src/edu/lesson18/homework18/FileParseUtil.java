package edu.lesson18.homework18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParseUtil {

    private static final String END = "Конец";
    private static final String EMPTY_LINE = "";
    private static final String REGEX = "(^\\d{2}:\\d{2})\\s*(.*)$";

    private FileParseUtil() {
    }

    public static List<Map<String, String>> getList(Path path) throws IOException {
        File file = path.toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Map<String, String> map = new LinkedHashMap<>();
            List<Map<String, String>> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                if (EMPTY_LINE.equals(line)) {
                    continue;
                }
                Matcher matcher = getMatcher(line);
                while (matcher.find()) {
                    String value = matcher.group(2);
                    map.put(matcher.group(1), value);
                    if (END.equals(value)) {
                        list.add(map);
                        map = new LinkedHashMap<>();
                    }
                }
            }
            return list;
        }
    }

    private static Matcher getMatcher(String line) {
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(line);
    }
}
