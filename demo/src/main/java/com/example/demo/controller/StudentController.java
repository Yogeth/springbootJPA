package com.example.demo.controller;
import java.util.*;
import com.example.demo.model.Student;
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
  
  @GetMapping("students/{rno}")
  public Student getbyrollno(@PathVariable int rno){
   return st.getbyrollno(rno);
  }
  
  @PostMapping("students")
  public String addStudents(@RequestBody Student student){
    st.addStudents(student);
    return "ADDED SUCESSFULLY!";
  }
  
@PutMapping("students")
public String updatestudent(@RequestBody Student student){
  st.update(student);
  return "SUCESSFULLY UPDATED!";
}

@DeleteMapping("students")
public String deleteStudents(){
  st.deleteall();
  return "TABLE STUDENT CLEARED!";
}

@DeleteMapping("students/{rno}")
public String deletebyrno(@PathVariable int rno){
  st.deleteByrno(rno);
  return "DELETED SUCESSFULLY!";
}

}