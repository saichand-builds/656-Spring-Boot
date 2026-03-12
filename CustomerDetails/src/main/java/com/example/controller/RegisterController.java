package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController
@RequestMapping("/company")
public class RegisterController {
	
	@GetMapping("/register")
	public ResponseEntity<Customer> showRegister(){
		
		Customer cust= new Customer(1, "Sai", 13.3);
		
		HttpStatus status=HttpStatus.OK;
		
		return new ResponseEntity<Customer>(cust, status);
	}

}
