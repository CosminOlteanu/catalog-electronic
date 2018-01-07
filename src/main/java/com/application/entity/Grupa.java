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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}
    
}

