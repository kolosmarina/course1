package edu.lesson12.homework12.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbersFileSorting {

    public static void main(String[] args) {
        List<Integer> randomIntegers = generateRamdomIntegers(50, 1000);
        File file = writeToFile(randomIntegers, "Numbers.txt");
        Set<Integer> sorted = sortAscending(file);
        writeToFile(sorted, "Numbers.txt");
    }

    private static List<Integer> generateRamdomIntegers(int count, int range) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            result.add((int) (Math.random() * range));
        }
        return result;
    }

    private static Set<Integer> sortAscending(File file) {
        Set<Integer> sorted = new TreeSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                sorted.add(Integer.valueOf(line));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно найти файл: " + file.getName());
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: " + file.getName());
        }
        return sorted;
    }

    private static File writeToFile(Collection<Integer> content, String fileName) {
        Path path = Paths.get("src", "edu", "lesson12", "homework12", "task2", fileName);
        File file = path.toFile();
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Невозможно создать файл: " + file.getName());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Integer element : content) {
                writer.append(element.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Невозможно записать файл: " + file.getName());
        }
        return file;
    }
}
