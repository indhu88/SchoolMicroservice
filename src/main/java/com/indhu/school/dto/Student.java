package com.indhu.school.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{
	
	private int id;
	private String firstName;
	private String lastName;

	private String emailId;
}

