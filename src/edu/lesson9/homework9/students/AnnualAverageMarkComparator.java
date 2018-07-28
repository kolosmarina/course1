package edu.lesson9.homework9.students;

import java.util.Comparator;

public class AnnualAverageMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAnnualAverageMark(), o2.getAnnualAverageMark());
    }
}
