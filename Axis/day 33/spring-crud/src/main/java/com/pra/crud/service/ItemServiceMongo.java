package com.pra.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pra.crud.domain.Item;
import com.pra.crud.repsitory.ItemRepository;

@Service
public class ItemServiceMongo implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public Integer create(Item item) {
        repository.save(item);
        return 0;
    }

    @Override
    public List<Item> readAll() { 
        return repository.findAll();
    }

    @Override
    public Integer update(Item item) {
        repository.save(item);
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        repository.deleteById(id);
        return 0;
    }
}
