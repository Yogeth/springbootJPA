package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Studentrepo extends JpaRepository<Student,Integer>{
  
}