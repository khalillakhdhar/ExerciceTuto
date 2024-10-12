package com.elitech.model.entities;

import java.util.List;

import com.elitech.model.BaseEntity;

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
public class Tag extends BaseEntity {
private String name;
@ManyToMany(mappedBy = "tags")
private List<Tutorial> tutorials;
}
