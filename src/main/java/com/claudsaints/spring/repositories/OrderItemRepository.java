package com.claudsaints.spring.repositories;

import com.claudsaints.spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{


}
