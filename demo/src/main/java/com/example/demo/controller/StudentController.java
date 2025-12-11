package com.example.demo.controller;
import java.util.*;
import com.examaple.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController{
  
  @Autowired
  StudentService st;
  
  @GetMapping("students")
  public List<Student> getAllstudents(){
    return st.getstudents();
  }
  
}