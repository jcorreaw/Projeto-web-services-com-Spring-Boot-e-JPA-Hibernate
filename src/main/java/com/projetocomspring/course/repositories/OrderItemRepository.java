package com.projetocomspring.course.repositories;

import com.projetocomspring.course.entities.OrderItem;
import com.projetocomspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
