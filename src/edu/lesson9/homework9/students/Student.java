package edu.lesson9.homework9.students;

public class Student {
    private String surname;
    private String name;
    private int age;
    private double annualAverageMark;

    public Student(String surname, String name, int age, double annualAverageMark) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.annualAverageMark = annualAverageMark;
    }

    @Override
    public String toString() {
        return "Student {" +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", annualAverageMark = " + annualAverageMark +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAnnualAverageMark() {
        return annualAverageMark;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnnualAverageMark(double annualAverageMark) {
        this.annualAverageMark = annualAverageMark;
    }
}
