package com.elitech.model.entities;

import java.util.Set;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Student extends BaseEntity {
private String nom;
private int niveau;
	@Column(unique = true)
	private String studentSerial;
	@ManyToMany
	@JoinTable(
			name = "coursSuivis",
			joinColumns = @JoinColumn(name="studentSerial",referencedColumnName = "studentSerial"),
			inverseJoinColumns = @JoinColumn(name="courseCode",referencedColumnName = "courseCode")
			)
	private Set<Course> courses;
}
