package com.claudsaints.spring.repositories;

import com.claudsaints.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{

}
