package com.indhu.student.dto;

public record StudentDto(Integer id, String firstName, String lastName,String emailId) {   
	// Non-private no-argument constructor
	public StudentDto() {
	
    this(0, null,null,null); // Explicit invocation to the canonical constructor

} 
}

