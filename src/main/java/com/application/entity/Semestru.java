package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "SEMESTRU")
public class Semestru {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SM_ID")
	private Long id;

	@Column(name = "SM_NUMAR")
    private Long numar;

	@Column(name = "SM_AU_ID")
	private Long anUniversitarId;
    
}

