package com.example.Model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PathTest  implements Serializable{
	

	private Integer Id;
	private String Name;
	private Double Salary;

}
