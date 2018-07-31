package edu.lesson9.homework9.students;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
