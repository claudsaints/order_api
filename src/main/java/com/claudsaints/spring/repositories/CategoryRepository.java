package com.claudsaints.spring.repositories;

import com.claudsaints.spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{


}
