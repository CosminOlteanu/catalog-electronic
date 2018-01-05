package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "GRUPA")
public class Grupa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "G_ID")
	private Long id;

	@Column(name = "G_FACULTATE")
    private String facultate;

	@Column(name = "G_SPECIALIZARE")
	private String specializare;
    
}

