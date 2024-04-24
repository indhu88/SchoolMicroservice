package com.indhu.school.dto;

import java.util.List;

public record SchoolDto(Integer id, String schoolName,String emailId,List<Student> students) {   
	// Non-private no-argument constructor
	public SchoolDto() {
	
    this(0, null,null,null); // Explicit invocation to the canonical constructor

} 
}
