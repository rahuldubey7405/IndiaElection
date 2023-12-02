package com.springBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootProject.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer> {

	Signup findByUserNameAndPassword(String userName, String password);

}
