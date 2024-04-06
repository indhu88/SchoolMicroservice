package com.indhu.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="school_id")
	private Integer schoolId;
	@Column(name="school_id")
	private String emailId;
	

}
