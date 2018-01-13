package com.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StudentInfoDto {
    private String nume;
    private String prenume;
    private Long grupa;
    private String facultate;
    private String specializare;
    private Long an;
    private Long semestru;
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
	public Long getGrupa() {
		return grupa;
	}
	public void setGrupa(Long grupa) {
		this.grupa = grupa;
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
	public Long getAn() {
		return an;
	}
	public void setAn(Long an) {
		this.an = an;
	}
	public Long getSemestru() {
		return semestru;
	}
	public void setSemestru(Long semestru) {
		this.semestru = semestru;
	}
    
}
