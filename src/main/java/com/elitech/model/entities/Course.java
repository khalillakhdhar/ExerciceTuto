package com.elitech.model.entities;

import java.util.List;
import java.util.Set;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Course extends BaseEntity{

	@Column(unique = true)
	private String courseCode;
	private String title;
	private String description;
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;
}
