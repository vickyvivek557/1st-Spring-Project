package com.example.studentmanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> db = new HashMap<>();
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo(), student);
        return "Student has been added successfully.";
    }
    @GetMapping("/getByPath/{regNo}")
    public Student getStudentByPath(@PathVariable("regNo") int regNO){
        return db.get(regNO);
    }

//    @PutMapping("/update_age/{id}")
//    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge){
//        db.get(regNo).setAge(newAge);
//        return db.get(regNo);
//    }
    @PutMapping("/update_age/{id}/{age}")
    public Student updateAge(@PathVariable("id") int regNo, @PathVariable("age") int newAge){
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

}
