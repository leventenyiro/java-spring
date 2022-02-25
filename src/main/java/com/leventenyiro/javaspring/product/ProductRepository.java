package com.leventenyiro.javaspring.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends JpaRepository<Product, Integer> {
    
}
