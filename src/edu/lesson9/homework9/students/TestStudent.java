package edu.lesson9.homework9.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", "Иванов", 25, 9.1),
                new Student("Сергей", "Сидоров", 22, 9.7),
                new Student("Иван", "Савченко", 23, 9.9),
                new Student("Сергей", "Сидоров", 22, 9.8),
                new Student("Никита", "Ткач", 24, 9.9)
        );

        List<Student> bestStudents = lookForStudentWithMaxAnnualAverageMark(students);
        print(bestStudents);
        System.out.println();

        students.sort(new ComplexComparator());
        print(students);
    }

    public static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static List<Student> lookForStudentWithMaxAnnualAverageMark(List<Student> students) {
        List<Student> studentsMaxMark = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        Student maxAnnualAverageMark = iterator.next();
        studentsMaxMark.add(maxAnnualAverageMark);

        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getAnnualAverageMark() > studentsMaxMark.get(0).getAnnualAverageMark()) {
                studentsMaxMark.clear();
                studentsMaxMark.add(current);
            } else if (current.getAnnualAverageMark() == studentsMaxMark.get(0).getAnnualAverageMark()) {
                studentsMaxMark.add(current);
            }
        }
        return studentsMaxMark;
    }
}
