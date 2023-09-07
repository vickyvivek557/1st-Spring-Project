package com.example.studentmanagementsystem;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> db = new HashMap<>();

    public Student getStudent(int regNo){
        return db.get(regNo);
    }

    public void addStudent(Student student) {
        db.put(student.getRegNo(), student);
    }

    public Student getStudentByPath(int regNo) {
        return db.get(regNo);
    }
    public Student updateAge(int regNo, int newAge){
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }
}
