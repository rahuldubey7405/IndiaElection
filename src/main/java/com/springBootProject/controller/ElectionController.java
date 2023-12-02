package com.springBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBootProject.model.Signup;
import com.springBootProject.service.SignupService;

@Controller
public class ElectionController {
	@Autowired
	private SignupService signupService;

	@RequestMapping("/")
	public String home() {
		System.out.println("this is index page bydefult ");
		return "index";
	}

//	@RequestMapping("/signup")
	@PostMapping("/signup")
	public String signupPage(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("start signup page!!!");
		Signup signup = new Signup();
		signup.setUserName(username);
		signup.setPassword(password);

		Signup addSignup = signupService.AddSignup(signup);
//		System.out.println("this is signup page project UserName: " + username + "pass " + password);

		
		return "signupSuccessful";
	}
	

	@PostMapping("/login")
	public String loginPage(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("start login page!!!!!!!!!!!!!!");
		Signup signup = new Signup();
		signup.setUserName(username);
		signup.setPassword(password);
		try {
			Signup dbLoginDetails = signupService.GetLogin(signup);
			System.out.println("this is login page project UserName: " + username + ": pass " + password);
			if (username.equals(dbLoginDetails.getUserName()) && password.equals(dbLoginDetails.getPassword())) {
				return "registertion";// UserRegistertion
			} else {
				return "loginError";
			}
		} catch (Exception e) {
			return "loginError";
		}
	}
}
