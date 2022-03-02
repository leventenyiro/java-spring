package com.leventenyiro.javaspring.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository productRepository;

    @Autowired
    public UserService(UserRepository productRepository) {
        this.productRepository = productRepository;
    }
    
	/*public List<User> getProducts() {
		//return List.of(new Product(1, "Sajt", 750));
        return productRepository.findAll();
	}

    public void addProduct(User product) {
        //System.out.println("product: " + product);
        productRepository.save(product);
    }

    public User getProduct(Integer id) {
        //System.out.println("product: " + product);
        return productRepository.findById(id).get();
    }

    public void updateProduct(Integer id, User product) {
        //System.out.println("product: " + product);
        User oldProduct = productRepository.getById(id);
        oldProduct.setName(product.getName());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setActive(product.getActive());
        oldProduct.setImage(product.getImage());
        productRepository.save(oldProduct);
    }

    public void deleteProduct(Integer id) {
        //System.out.println("product: " + product);
        productRepository.deleteById(id);
    }*/
}
