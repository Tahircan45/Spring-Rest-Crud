package com.tahircan.crud.example.repository;

import com.tahircan.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
