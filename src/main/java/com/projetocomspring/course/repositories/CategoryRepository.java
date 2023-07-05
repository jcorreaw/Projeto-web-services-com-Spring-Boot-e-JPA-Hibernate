package com.projetocomspring.course.repositories;

import com.projetocomspring.course.entities.Category;
import com.projetocomspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
