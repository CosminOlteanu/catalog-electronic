package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "PROFESOR")
public class Profesor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "P_ID")
	private Long id;

	@Column(name = "P_NUME")
    private String nume;

	@Column(name = "P_PRENUME")
	private String prenume;
}

