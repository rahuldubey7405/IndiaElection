package com.springBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProject.model.Signup;
import com.springBootProject.repository.SignupRepository;

@Service
public class SignupService {
	@Autowired
	private SignupRepository signupRepository;

	public Signup AddSignup(Signup signup) {
		return signupRepository.save(signup);

	}

	public Signup GetLogin(Signup signup) {
		return signupRepository.findByUserNameAndPassword(signup.getUserName(), signup.getPassword());
	}
}
