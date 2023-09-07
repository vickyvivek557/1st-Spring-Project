package com.example.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo){
        return studentRepository.getStudent(regNo);
    }
    public String addStudent(Student student){
        studentRepository.addStudent(student);
        return "Student added successfully.";
    }
    public Student getStudentByPath(int regNo){
        return studentRepository.getStudentByPath(regNo);
    }
    public Student updateAge(int regNo, int newAge){
        return studentRepository.updateAge(regNo, newAge);
    }
}
