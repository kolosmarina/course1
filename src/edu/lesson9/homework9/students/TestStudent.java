package edu.lesson9.homework9.students;

import java.util.*;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", "Иванов", 25, 9.1),
                new Student("Сергей", "Сидоров", 22, 9.7),
                new Student("Иван", "Савченко", 23, 9.8),
                new Student("Сергей", "Сидоров", 22, 9.1),
                new Student("Никита", "Ткач", 24, 9.9)
        );

        print(students);
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
                Comparator.comparing(Student::getName)
                        .thenComparing(Student::getSurname)
                        .thenComparing(Student::getAge)
                        .thenComparing(Student::getAnnualAverageMark)
        );
        print(students);
    }

    private static List<Student> lookForStudentWithMaxAnnualAverageMark(List<Student> students) {
        //List<Student> studentsMaxMark = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        Student maxAnnualAverageMark = iterator.next();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getAnnualAverageMark() > maxAnnualAverageMark.getAnnualAverageMark()) {
                maxAnnualAverageMark = current;
            }
            // maxAnnualAverageMark = (current.getAnnualAverageMark() > maxAnnualAverageMark.getAnnualAverageMark())
            //  ? current : maxAnnualAverageMark;
            students.add(current);
        }
        return students;
    }

    public static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
