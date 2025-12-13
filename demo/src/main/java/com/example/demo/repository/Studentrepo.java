package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Student;
import java.util.*;
@Repository
public interface Studentrepo extends JpaRepository<Student,Integer>{
   List<Student> findByTechnology(String technology);
}