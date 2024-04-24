package com.indhu.school.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indhu.school.dto.SchoolDto;
import com.indhu.school.entity.SchoolEntity;
import com.indhu.school.exception.DuplicatedException;
import com.indhu.school.repository.SchoolRepository;
import com.indhu.school.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolRepository repository;
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public SchoolEntity addSchool(SchoolEntity entity) {
		// TODO Auto-generated method stub
		if (repository.existsByEmail(entity.getEmail())) {
            throw new DuplicatedException("Email Id " + entity.getEmail() + " already exists");
        }
		return repository.save(entity);

	}

	@Override
	public List<SchoolDto> getAllSchools() {
		 List<SchoolEntity> schoolList = repository.findAll();
		 System.out.println("values"+schoolList);
		 
	        return schoolList.stream().map((schoolen) -> mapper.map(schoolen, SchoolDto.class))
	                .collect(Collectors.toList());
	}

}
