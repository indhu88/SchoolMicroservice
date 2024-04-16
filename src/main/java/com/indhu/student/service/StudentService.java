package com.indhu.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indhu.student.dto.StudentDto;
import com.indhu.student.entity.StudentEntity;
import com.indhu.student.exception.DuplicateIdException;
import com.indhu.student.repo.StudentRepository;
import com.indhu.student.serviceImpl.StudentServiceImpl;


@Service
public class StudentService implements StudentServiceImpl {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private ModelMapper mapper;
	
	

	@Override
	public StudentEntity addStudent(StudentEntity entity) {
        if (studentRepo.existsByEmailId(entity.getEmailId())) {
            throw new DuplicateIdException("Email Id " + entity.getEmailId() + " already exists");
        }

		return studentRepo.save(entity);
	}
	@Override
	public List<StudentDto> getAllStudents() {
		 List<StudentEntity> studentList = studentRepo.findAll();
	        return studentList.stream().map((studenten) -> mapper.map(studenten, StudentDto.class))
	                .collect(Collectors.toList());
	        
	       

	}

	@Override
	public List<StudentDto> getAllStudentsBySchoolId(Integer schoolId) {
		List<StudentDto> specficSchoolStudents = studentRepo.findAllStudentsBySchoolId(schoolId);

		return specficSchoolStudents;
	}

}
