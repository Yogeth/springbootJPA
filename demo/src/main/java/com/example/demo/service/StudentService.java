package com.example.demo.service;
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
}