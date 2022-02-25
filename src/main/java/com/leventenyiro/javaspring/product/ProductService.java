package com.leventenyiro.javaspring.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
	public List<Product> getProducts() {
		//return List.of(new Product(1, "Sajt", 750));
        return productRepository.findAll();
	}

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
