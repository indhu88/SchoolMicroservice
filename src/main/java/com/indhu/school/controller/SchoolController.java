package com.indhu.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indhu.school.ApiResponse;
import com.indhu.school.dto.SchoolDto;
import com.indhu.school.entity.SchoolEntity;
import com.indhu.school.service.SchoolService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/schools")
@Validated
public class SchoolController {

	
	@Autowired
	private SchoolService service;
	@PostMapping("/add_school")
	public ApiResponse<SchoolEntity> save(@Valid @RequestBody SchoolEntity entity) {
       

		SchoolEntity newschool = service.addSchool(entity);
            return ApiResponse.ok(newschool,"School Created SucessFully",HttpStatus.CREATED);

	}
	
	@GetMapping
	public ResponseEntity<List<SchoolDto>> getSchoolList(){
		
		return ResponseEntity.ok(service.getAllSchools());
		
	}


}
