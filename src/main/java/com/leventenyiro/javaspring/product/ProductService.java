package com.leventenyiro.javaspring.product;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ProductService {
    @GetMapping
	public List<Product> getProducts() {
		return List.of(new Product(1, "Sajt", 750));
	}
}
