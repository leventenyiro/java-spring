package com.leventenyiro.javaspring.controllers;

import java.util.List;

import com.leventenyiro.javaspring.models.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    //@RequestMapping(path="valami")
    @GetMapping
	public List<Product> getProducts() {
		return List.of(new Product(1, "Sajt", 750));
	}
}
