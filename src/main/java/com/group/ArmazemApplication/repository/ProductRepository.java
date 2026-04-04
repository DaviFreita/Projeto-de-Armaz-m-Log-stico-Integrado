package com.group.ArmazemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.ArmazemApplication.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameProductContainingIgnoreCaseOrCategoryContainingIgnoreCase(String name, String category);
}