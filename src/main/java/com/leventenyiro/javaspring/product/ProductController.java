package com.leventenyiro.javaspring.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

    //@RequestMapping(path="valami")
    @GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
}
