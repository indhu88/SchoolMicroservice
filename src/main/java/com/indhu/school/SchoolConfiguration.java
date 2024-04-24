package com.indhu.school;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SchoolConfiguration {
	
	@Bean
    public ModelMapper modelMapper() {
		 ModelMapper modelMapper = new ModelMapper();
		 modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());

        return modelMapper;
    }
	@Bean
	public RestTemplate getRestTemplate() {
		// RestTemplate is the utility object which makes this call
		return new RestTemplate();
	}

	
}
