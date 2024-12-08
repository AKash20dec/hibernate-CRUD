package com.ak.Hibernate_servlet_CRUD_operation.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	@Column(name="DateOfJoining")
	private LocalDate dob;
	private String email;
	

	
}
