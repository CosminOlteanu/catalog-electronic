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

	@Column(name = "AU_NUME")
    private String nume;

	@Column(name = "AU_S_ID")
	private Long studentId;
    
}

