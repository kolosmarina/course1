package edu.lesson9.homework9.students;

import java.util.*;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иванов", "Иван", 25, 9.1),
                new Student("Сидоров", "Андрей", 22, 9.7),
                new Student("Сидорова", "Ольга", 22, 9.8),
                new Student("Сидоров", "Андрей", 25, 9.1),
                new Student("Иванов", "Иван", 25, 9.9)
        );

        print(students);
        System.out.println();

        lookForMaxAnnualAverageMark(students);
        System.out.println();

        students.sort(new SurnameComparator());
        print(students);
        System.out.println();

        students.sort(new NameComparator());
        print(students);
        System.out.println();

        students.sort(new AgeComparator());
        print(students);
        System.out.println();

        students.sort(new AnnualAverageMarkComparator());
        print(students);
        System.out.println();

        students.sort(new ComplexComparator());
        print(students);
        System.out.println();

        students.sort(
                Comparator.comparing(Student::getSurname)
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getAge)
                        .thenComparing(Student::getAnnualAverageMark)
        );
        print(students);
    }

    private static void lookForMaxAnnualAverageMark(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        Student maxAnnualAverageMark = iterator.next();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            maxAnnualAverageMark = (current.getAnnualAverageMark() > maxAnnualAverageMark.getAnnualAverageMark())
                    ? current : maxAnnualAverageMark;
        }
        System.out.println("Ученик с самым высоким средним баллом " + maxAnnualAverageMark);
    }

    public static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
