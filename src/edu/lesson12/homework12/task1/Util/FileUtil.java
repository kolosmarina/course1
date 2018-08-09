package edu.lesson12.homework12.task1.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileUtil {
    public static void printToFile(Map<Character, Integer> map, String fileName) {
        Path resultPath = Paths.get("src", "edu", "lesson12", "homework12", "task1", fileName);
        File fileResult = resultPath.toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileResult))) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                writer.append(String.valueOf(entry.getKey()))
                        .append(" - ")
                        .append(String.valueOf(entry.getValue()));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Невозможно записать файл: " + fileResult.getName());
        }
    }
}
