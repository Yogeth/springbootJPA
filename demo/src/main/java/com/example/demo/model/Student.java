package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student{
  private String name;
  private int age;
  @Id
  private int rollno;
  private String gender;
}