package com.example.sgic.university.Repository;

import com.example.sgic.university.Entities.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student, Long> {
}
