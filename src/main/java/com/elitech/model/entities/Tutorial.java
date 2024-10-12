package com.elitech.model.entities;

import java.util.List;
import java.util.Set;

import com.elitech.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Tutorial extends BaseEntity{
private String title;
private String description;
private boolean published;
@OneToOne(mappedBy = "tutorial")
private TutorialDetails tutorialDetails;
@OneToMany(mappedBy = "tutorial")
private List<Comment> comments;
@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
private Set<Tag> tags;
}
