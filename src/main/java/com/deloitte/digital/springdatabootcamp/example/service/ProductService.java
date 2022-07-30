package com.deloitte.digital.springdatabootcamp.example.service;

import com.deloitte.digital.springdatabootcamp.example.entity.Product;
import com.deloitte.digital.springdatabootcamp.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void create() {
        Product product = new Product();
        product.setName("Beer");

        productRepository.save(product);
    }
}
