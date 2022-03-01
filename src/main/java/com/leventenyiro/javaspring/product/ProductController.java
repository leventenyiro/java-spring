package com.leventenyiro.javaspring.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		//System.out.println(productService.getProducts().get(0).getName());
		return productService.getProducts();
	}

	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@GetMapping(path = "{id}")
	public ResponseEntity getProduct(@PathVariable("id") Integer id) {
		try {
			return ResponseEntity.accepted().body(productService.getProduct(id));
		} catch (Exception ex) {
			return ResponseEntity.notFound().build();
		}

	}

	@PutMapping(path = "{id}")
	public void updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
		productService.updateProduct(id, product);
	}

	@DeleteMapping(path = "{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}
}
