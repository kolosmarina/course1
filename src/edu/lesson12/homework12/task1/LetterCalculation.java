package edu.lesson12.homework12.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class LetterCalculation {

    public static void main(String[] args) {
        Map<Character, Integer> letters = calculateLetters("Poem.txt");
        printToFile(letters, "Result.txt");
    }

    private static Map<Character, Integer> calculateLetters(String fileName) {
        Path path = Paths.get("src", "edu", "lesson12", "homework12", "task1", fileName);
        File file = path.toFile();
        Map<Character, Integer> result = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                line = line.toLowerCase();
                char[] chars = line.toCharArray();
                for (char element : chars) {
                    if (Character.isLetter(element)) {
                        Integer count = result.get(element);
                        if (count != null) {
                            count += 1;
                        } else {
                            count = 1;
                        }
                        result.put(element, count);
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно найти файл: " + file.getName());
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: " + file.getName());
        }
        return result;
    }

    private static void printToFile(Map<Character, Integer> map, String fileName) {
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
