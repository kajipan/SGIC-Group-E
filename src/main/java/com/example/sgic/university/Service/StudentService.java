package com.example.sgic.university.Service;

import org.springframework.stereotype.Service;

import com.example.sgic.university.Entities.student;
import com.example.sgic.university.Repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public student saveStudent(student student) {
        return studentRepository.save(student);
    }

    
}
