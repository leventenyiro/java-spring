package com.leventenyiro.javaspring.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //@Query("SELECT * FROM product")
    //Optional<Product> getProducts();
}