package com.springBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.model.UserRegistration;
import com.springBootProject.service.UserRegistrationService;

@Controller
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService registrionService;

	@PostMapping("/registertion")
	public String addUserRegistrion(@ModelAttribute UserRegistration registration, Model model) {

		System.out.println("start registrion@@" + registration);
		if (registration.getAge() < 18) {
			System.out.println("age not currect");
			model.addAttribute("message", "Not eligible - Must be 18 or older.");
			return "IneligibleUser";

		}
		UserRegistration addRegistrion = registrionService.AddRegistrion(registration);

		return "registrationSeccess";
	}
}
