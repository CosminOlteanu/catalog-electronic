package com.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StudentDto {
    private Long id;
    private String nume;
    private String prenume;
    private String cnp;
    private Long grupaId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public Long getGrupaId() {
		return grupaId;
	}
	public void setGrupaId(Long grupaId) {
		this.grupaId = grupaId;
	}
    
}