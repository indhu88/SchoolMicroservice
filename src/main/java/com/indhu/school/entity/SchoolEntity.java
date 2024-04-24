package com.indhu.school.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "school")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchoolEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Please provide a valid school name")
	@Size(min=2,message="Atleast First Name  u have minimum 2 letters")
	private String name;
	@NotBlank(message = "Please provide  email address")
    @Email(message = "Please provide a valid email address")
	private String email;

}
