package edu.lesson9.homework9.students;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Student> {

    NameComparator nameComparator = new NameComparator();
    SurnameComparator surnameComparator = new SurnameComparator();
    AgeComparator ageComparator = new AgeComparator();
    AnnualAverageMarkComparator annualAverageMarkComparator = new AnnualAverageMarkComparator();

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = nameComparator.compare(o1, o2);
        compareResult = compareResult == 0 ? surnameComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? ageComparator.compare(o1, o2) : compareResult;
        return compareResult == 0 ? annualAverageMarkComparator.compare(o1, o2) : compareResult;
    }
}
