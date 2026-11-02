package com.example.sgic.university.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sgic.university.Entities.student;
import com.example.sgic.university.Service.StudentService;

@RestController
@RequestMapping("/students3")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    
   
    @PostMapping
    public student saveStudent(@RequestBody student student) {
        return studentService.saveStudent(student);
    }

   
}
