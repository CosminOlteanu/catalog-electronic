package com.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SemestruDto {
    private Long semestru;
    private Boolean inCurs;
	public Long getSemestru() {
		return semestru;
	}
	public void setSemestru(Long semestru) {
		this.semestru = semestru;
	}
	public Boolean getInCurs() {
		return inCurs;
	}
	public void setInCurs(Boolean inCurs) {
		this.inCurs = inCurs;
	}
    
}
