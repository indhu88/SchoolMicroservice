package com.indhu.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indhu.student.dto.StudentDto;
import com.indhu.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	List<StudentDto> findAllStudentsBySchoolId(Integer schoolId);
}
