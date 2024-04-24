package com.indhu.school.dto;

public record Student(Integer id, String firstName, String lastName,String emailId) {   
	// Non-private no-argument constructor
	public Student() {
	
    this(0, null,null,null); // Explicit invocation to the canonical constructor

} 
}

