package com.indhu.student.serviceImpl;

import java.util.List;

import com.indhu.student.dto.StudentDto;
import com.indhu.student.entity.StudentEntity;

public interface StudentServiceImpl {
	
	void addStudent(StudentEntity entity);
	List<StudentDto> getAllStudents();
	List<StudentDto>  getAllStudentsBySchoolId(Integer schoolId);

}
