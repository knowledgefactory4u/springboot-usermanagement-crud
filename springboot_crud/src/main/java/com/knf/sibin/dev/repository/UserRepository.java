package com.knf.sibin.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knf.sibin.dev.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
