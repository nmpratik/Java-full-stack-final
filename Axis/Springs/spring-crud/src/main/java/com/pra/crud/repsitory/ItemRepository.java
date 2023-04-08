package com.pra.crud.repsitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pra.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    
}

