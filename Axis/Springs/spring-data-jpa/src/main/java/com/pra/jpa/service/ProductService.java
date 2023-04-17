package com.pra.jpa.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import com.pra.jpa.domain.Product;
import com.pra.jpa.repo.ProductRepository;

import lombok.AllArgsConstructor;

@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRED) 
@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository repository;

    private final TransactionTemplate transactionTemplate;

    public void save() {

        repository.deleteById(2L);

        Product prd = new Product();
        prd.setName("aaa");
        prd.setCategory("vvv");
        prd.setPrice(78.90d);
        repository.save(prd);
    }

    public void customMethod(long id) {
        transactionTemplate.execute(status -> {
            repository.deleteCustom(id);
            return 0;
        });
    }

    // @Transactional()
    public void customUpadte(long id) {
        repository.deleteCustom(id);
    }
}
