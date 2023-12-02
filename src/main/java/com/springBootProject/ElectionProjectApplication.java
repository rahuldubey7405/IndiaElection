package com.springBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectionProjectApplication.class, args);
		System.out.println("-----------Start Election Project!!!!---------------");
		openHomePage();
	}

	private static void openHomePage() {
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:9090");
		} catch (Exception e) {
			System.out.println("Error in OpenHomePage in Wroser");
		}
	}
}
