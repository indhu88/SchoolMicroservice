package com.indhu.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//public record StudentDto(Integer id,String firstName,String lastName,String emailId) {
//
//}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto{
	
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	
}
