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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumar() {
		return numar;
	}

	public void setNumar(Long numar) {
		this.numar = numar;
	}

	public Long getAnUniversitarId() {
		return anUniversitarId;
	}

	public void setAnUniversitarId(Long anUniversitarId) {
		this.anUniversitarId = anUniversitarId;
	}
    
}

