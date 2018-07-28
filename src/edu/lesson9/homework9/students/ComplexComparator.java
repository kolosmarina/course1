package edu.lesson9.homework9.students;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Student> {

    SurnameComparator surnameComparator = new SurnameComparator();
    NameComparator nameComparator = new NameComparator();
    AgeComparator ageComparator = new AgeComparator();
    AnnualAverageMarkComparator annualAverageMarkComparator = new AnnualAverageMarkComparator();

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = surnameComparator.compare(o1, o2);
        compareResult = compareResult == 0 ? nameComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? ageComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? annualAverageMarkComparator.compare(o1, o2) : compareResult;
        return compareResult;
    }
}
