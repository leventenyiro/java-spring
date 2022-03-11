package com.leventenyiro.javaspring.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    //@SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Integer id;
    private String name;
    private Integer price;
    private Integer active;
    private String image;

    public Product(Integer id, String name, Integer price, Integer active, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
        this.image = image;
    }

    public Product() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product [active=" + active + ", id=" + id + ", image=" + image + ", name=" + name + ", price=" + price
                + "]";
    }

    
}
