package com.example.studentmanagementsystem;

public class Student {
    private String name;
    private int regNo;
    private int age;
    private String course;

    public Student() {
    }

    public Student(String name, int regNo, int age, String course) {
        this.name = name;
        this.regNo = regNo;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
