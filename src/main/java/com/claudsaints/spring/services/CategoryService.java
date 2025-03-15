package com.claudsaints.spring.services;

import com.claudsaints.spring.entities.Category;
import com.claudsaints.spring.entities.Order;
import com.claudsaints.spring.repositories.CategoryRepository;
import com.claudsaints.spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
     return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }


}
