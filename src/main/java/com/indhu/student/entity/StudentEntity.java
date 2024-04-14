package com.indhu.student.entity;

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
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Please provide a valid first name")
	@Size(min=2,message="Atleast First Name  u have minimum 2 letters")
	private String firstName;
	@NotBlank(message = "Please provide  First name")
	@Size(min=2,message="Atleast First Name  u have minimum 2 letters")
	private String lastName;
	@NotBlank(message = "Please provide  email address")
    @Email(message = "Please provide a valid email address")
	private String emailId;
	private Integer schoolId;

}
