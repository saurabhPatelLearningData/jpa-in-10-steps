package com.javaLearning.jpa.jpain10steps.entity.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaLearning.jpa.jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long > {

}
