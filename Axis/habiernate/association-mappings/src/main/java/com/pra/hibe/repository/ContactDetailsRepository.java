package com.pra.hibe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.hibe.domain.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long>{
    
}

