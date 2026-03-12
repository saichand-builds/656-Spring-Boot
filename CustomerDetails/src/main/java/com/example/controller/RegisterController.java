package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController
@RequestMapping("/company")
public class RegisterController {

	private static final org.apache.logging.log4j.Logger logger = LogManager
			.getLogger(RegisterController.class);

	@GetMapping("/register")
	public ResponseEntity<List<Customer>> showRegister() {

		logger.info("Helper Method is created and called");
		// Customer cust = new Customer(1, "Sai", 13.3);

		List<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(12, "Sai", 2382));
		cust.add(new Customer(8, "Shafi", 821));
		cust.add(new Customer(2, "Harshi", 29));

		logger.info("Model class Object is created");

		HttpStatus status = HttpStatus.OK;

		return new ResponseEntity<List<Customer>>(cust, status);
	}

}
