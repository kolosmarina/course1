package edu.lesson18.homework18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReportWriteUtil {

    private ReportWriteUtil() {
    }

    /*public static void writeTo(Path path, List<String> list) throws IOException {
        File file = path.toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : list) {
                writer.append(line);
                writer.newLine();
            }
        }
    }*/
    public static void writeTo(Path path, List<String> list) throws IOException {
        Files.write(path, list);
    }
}
