package com.elitech.model.entities;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter	
@NoArgsConstructor
@ToString
public class Comment extends BaseEntity {

	@Lob
	private String content;
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	private Tutorial tutorial;
}
