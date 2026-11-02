package com.example.sgic.university.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Student")

public class student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long studentId;
   private String fullName;
   private String address;
   private String contactNo;


}

