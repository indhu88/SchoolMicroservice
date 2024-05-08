package com.indhu.school.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDto{
	
	private int id;
	private String schoolName;
	private String email;
	private List<Student> students;
}

