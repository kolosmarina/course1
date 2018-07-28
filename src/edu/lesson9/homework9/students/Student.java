package edu.lesson9.homework9.students;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double annualAverageMark;

    public Student(String name, String surname, int age, double annualAverageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.annualAverageMark = annualAverageMark;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", annualAverageMark = " + annualAverageMark +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAnnualAverageMark() {
        return annualAverageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnnualAverageMark(double annualAverageMark) {
        this.annualAverageMark = annualAverageMark;
    }
}
