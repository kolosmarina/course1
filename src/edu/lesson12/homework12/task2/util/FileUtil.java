package edu.lesson12.homework12.task2.util;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class FileUtil {

    public static File writeToFile(Collection<Integer> content, String fileName) {
        Path path = Paths.get("src", "edu", "lesson12", "homework12", "task2", fileName);
        File file = path.toFile();
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))) {
            for (Integer element : content) {
                stream.writeInt(element);
            }
        } catch (IOException e) {
            System.out.println("Невозможно записать файл: " + file.getName());
        }
        return file;
    }

    public static Set<Integer> sortAscending(File file) {
        Set<Integer> sorted = new TreeSet<>();
        try (DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
            int number;
            while (stream.available() > 0) {
                number = stream.readInt();
                sorted.add(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно найти файл: " + file.getName());
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: " + file.getName());
        }
        return sorted;
    }

    public static File writeToTextFile(Collection<Integer> content, File file) {
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
