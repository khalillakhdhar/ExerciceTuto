package com.elitech.model.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TutorialDetails {
@Id
private long tutorial_id;
private LocalDateTime createdAt;
private String createdBy;
@MapsId
@OneToOne(optional = false,cascade=CascadeType.ALL)
@JoinColumn(name = "tutorial_id")
private Tutorial tutorial;

@PrePersist
public void init()
{
createdAt=LocalDateTime.now();	
}


}
