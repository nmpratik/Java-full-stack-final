package com.pra.jpa.repo;

import org.springframework.data.jpa.domain.Specification;

import com.pra.jpa.domain.Product;

public class ProductSpecifications {
    
    public static Specification<Product> hasNameContaining(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%"+name+"%");
    }

    public static Specification<Product> hasPriceLessThan(double price) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("price"), price);
    }
}

