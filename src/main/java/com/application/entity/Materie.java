package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "MATERIE")
public class Materie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "M_ID")
	private Long id;

	@Column(name = "M_NUME")
    private String nume;

	@Column(name = "M_TIP")
	private String tip;

	@Column(name = "M_NR_CREDITE")
	private Long nrCredite;

	@Column(name = "M_P_ID")
	private Long profesorId;

	@Column(name = "M_G_ID")
	private Long groupaId;

	@Column(name = "M_AU_ID")
	private Long anUniversitarId;

}

