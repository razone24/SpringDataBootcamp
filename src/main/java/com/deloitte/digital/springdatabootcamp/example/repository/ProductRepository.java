package com.deloitte.digital.springdatabootcamp.example.repository;

import com.deloitte.digital.springdatabootcamp.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
