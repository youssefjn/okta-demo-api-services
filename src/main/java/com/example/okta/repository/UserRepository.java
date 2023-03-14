package com.example.okta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.okta.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
