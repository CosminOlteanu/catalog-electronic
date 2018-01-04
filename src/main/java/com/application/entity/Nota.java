package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "NOTA")
public class Nota {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "N_ID")
	private Long id;

	@Column(name = "N_VALOARE")
    private String valoare;

	@Column(name = "N_S_ID")
	private Long studentId;

	@Column(name = "N_M_ID")
	private Long materieId;
    
}

