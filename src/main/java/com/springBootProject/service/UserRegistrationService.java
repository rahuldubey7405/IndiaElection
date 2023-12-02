package com.springBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProject.model.UserRegistration;
import com.springBootProject.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	public UserRegistration AddRegistrion(UserRegistration registrion) {
		return userRegistrationRepository.save(registrion);
	}
}
