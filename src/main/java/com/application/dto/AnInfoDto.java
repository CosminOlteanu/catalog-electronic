package com.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class AnInfoDto {
    private Long an;
    private List<SemestruDto> semestre;
	public Long getAn() {
		return an;
	}
	public void setAn(Long an) {
		this.an = an;
	}
	public List<SemestruDto> getSemestre() {
		return semestre;
	}
	public void setSemestre(List<SemestruDto> semestre) {
		this.semestre = semestre;
	}
    
}
