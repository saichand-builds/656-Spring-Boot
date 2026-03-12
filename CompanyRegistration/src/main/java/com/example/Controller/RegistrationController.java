package com.example.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Company;
import com.example.Model.Employee;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	private static final Logger logger = LogManager
			.getLogger(RegistrationController.class);

	@GetMapping("/data")
	public ResponseEntity<Company> showData() {
		logger.info("Helper Method");
		Company com = new Company(13, "Sai", "Nellore", 287.2,
				List.of("Blue", "red", "pink"),
				Set.of(9652036113L, 8500773630L, 7095789742L),
				Map.of("Aadhar", 282876L, "Panno", 873282L),
				new Employee(12, "Harshi", "Nellore2"));
		
		logger.info("Complex Object is Created");

		HttpStatus status = HttpStatus.OK;

		return new ResponseEntity<Company>(com, status);
	}

}
