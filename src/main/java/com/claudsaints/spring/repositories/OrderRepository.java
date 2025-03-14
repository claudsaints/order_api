package com.claudsaints.spring.repositories;

import com.claudsaints.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
