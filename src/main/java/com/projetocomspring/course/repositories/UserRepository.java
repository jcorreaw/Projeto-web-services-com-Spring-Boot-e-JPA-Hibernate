package com.projetocomspring.course.repositories;

import com.projetocomspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
