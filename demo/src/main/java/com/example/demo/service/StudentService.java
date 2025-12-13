package com.example.demo.service;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepo;
import java.util.*;
@Service
public class StudentService{
  
  @Autowired
  Studentrepo repo;
  public List<Student> getstudents(){
    return repo.findAll();
  }
  public void addStudents(Student student){
      repo.save(student);
  }
  public Student getbyrollno(int rno){
    return repo.getById(rno).orElse(new Student());
  }
  
}