package com.indhu.school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.indhu.school.dto.SchoolDto;
import com.indhu.school.entity.SchoolEntity;

@Service
public interface SchoolService {
	SchoolEntity addSchool(SchoolEntity entity);
	List<SchoolDto> getAllSchools();

}
