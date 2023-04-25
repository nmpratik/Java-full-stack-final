package com.pra.hibe.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.hibe.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
    @Override
    List<Person> findAll();
}
    