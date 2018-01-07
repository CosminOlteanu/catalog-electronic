package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "AN_UNIVERSITAR")
public class AnUniversitar {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "AU_ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    }

