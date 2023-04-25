package com.pra.hibe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pra.hibe.domain.IdentityDoc;

public interface IdentityDocRepository extends JpaRepository<IdentityDoc, Long> {
    
}
