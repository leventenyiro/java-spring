package com.leventenyiro.javaspring.product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<User, Integer> {
    //@Query("SELECT * FROM product")
    //Optional<Product> getProducts();
}
