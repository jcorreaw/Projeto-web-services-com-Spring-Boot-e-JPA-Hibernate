package com.projetocomspring.course.repositories;

import com.projetocomspring.course.entities.Category;
import com.projetocomspring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
