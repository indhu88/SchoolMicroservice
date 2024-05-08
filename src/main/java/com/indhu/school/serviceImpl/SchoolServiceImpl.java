package com.indhu.school.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    @Autowired
    private RestTemplate restTemplate;
	@Override
	public SchoolEntity addSchool(SchoolEntity entity) {
		// TODO Auto-generated method stub
		if (repository.existsByNameOrEmail(entity.getName(),entity.getEmail())) {
            throw new DuplicatedException("Email Id or name" + entity.getEmail() + entity.getName()+" already exists");
        }
		
		return repository.save(entity);

	}

	@Override
	public List<SchoolDto> getAllSchools() {
		 List<SchoolEntity> schoolList = repository.findAll();
	        // Fetch list of schools
//	        ResponseEntity<List<School>> schoolsResponse = restTemplate.exchange(
//	            "http://school-service/schools",
//	            HttpMethod.GET,
//	            null,
//	            new ParameterizedTypeReference<List<School>>() {});
//	        List<School> schools = schoolsResponse.getBody();
//
//	        // Iterate through each school to fetch students
//	        for (School school : schools) {
//	            ResponseEntity<List<Student>> studentsResponse = restTemplate.exchange(
//	                "http://school-service/schools/{schoolId}/students",
//	                HttpMethod.GET,
//	                null,
//	                new ParameterizedTypeReference<List<Student>>() {},
//	                school.getId());
//	            List<Student> students = studentsResponse.getBody();
//	            // Do something with the list of students
//	        }
//	    }
//
	        return schoolList.stream().map((schoolen) -> mapper.map(schoolen, SchoolDto.class))
	                .collect(Collectors.toList());
	}

}
