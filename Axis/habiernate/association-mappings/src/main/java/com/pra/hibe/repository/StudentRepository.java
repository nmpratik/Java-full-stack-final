package com.pra.hibe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.hibe.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
