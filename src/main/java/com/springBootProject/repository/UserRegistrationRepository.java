package com.springBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootProject.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer>{

}
