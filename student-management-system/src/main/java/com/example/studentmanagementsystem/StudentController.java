package com.example.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/getByPath/{regNo}")
    public Student getStudentByPath(@PathVariable("regNo") int regNO){
        return studentService.getStudentByPath(regNO);
    }

//    @PutMapping("/update_age/{id}")
//    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge){
//        db.get(regNo).setAge(newAge);
//        return db.get(regNo);
//    }
    @PutMapping("/update_age/{id}/{age}")
    public Student updateAge(@PathVariable("id") int regNo, @PathVariable("age") int newAge){
        return studentService.updateAge(regNo, newAge);
    }

}
