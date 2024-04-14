package com.indhu.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indhu.student.dto.StudentDto;
import com.indhu.student.entity.StudentEntity;
import com.indhu.student.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/students")

public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/add_student")
	public void save(@Valid @RequestBody StudentEntity entity) {
        String s1 = entity.toString(); 
        String s2 = String.valueOf(s1); 

		System.out.println("/add_student"+s2);
		service.addStudent(entity);
	}
	
	@GetMapping
	public ResponseEntity<List<StudentDto>> getStudentList(){
		
		return ResponseEntity.ok(service.getAllStudents());
		
	}
	
	
	

}
