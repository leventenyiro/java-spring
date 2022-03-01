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
        //System.out.println("product: " + product);
        productRepository.save(product);
    }

    public Product getProduct(Integer id) {
        //System.out.println("product: " + product);
        return productRepository.findById(id).get();
    }

    public void updateProduct(Integer id, Product product) {
        //System.out.println("product: " + product);
        Product oldProduct = productRepository.getById(id);
        oldProduct.setName(product.getName());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setActive(product.getActive());
        oldProduct.setImage(product.getImage());
        productRepository.save(oldProduct);
    }

    public void deleteProduct(Integer id) {
        //System.out.println("product: " + product);
        productRepository.deleteById(id);
    }
}
