package com.example.Model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Company  implements Serializable{
	
	private Integer Id;
	private String CandiName;
	private String Address;
	private double Salary;
	private List<String>favColor;
	private Set<Long> phoneNumbers;
	private Map<String, Object> iDdetails;
	
	@Autowired
	private Employee emp;
	
	
}
