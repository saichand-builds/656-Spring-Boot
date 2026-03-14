package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {
	
	/*
	 * @GetMapping("/save/{id}/{name}") public
	 * ResponseEntity<String>registerTest(@PathVariable Integer id,@PathVariable
	 * String name){
	 * 
	 * return new ResponseEntity<String>("Good Morning "+id + " "+ name,
	 * HttpStatus.OK); }
	 */
	
	@GetMapping("/save/")
	public String registerTest(@RequestParam ("Id") Integer Id , @RequestParam("name") String name) {
			
		return Id+ " -> "+name;
		
	}

}
