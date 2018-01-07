package com.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class NotaStudentDto {
    private String materie;
    private String tipExamen;
    private Long numarCredite;
    private String profesor;
    private String nota;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date data;
	public String getMaterie() {
		return materie;
	}
	public void setMaterie(String materie) {
		this.materie = materie;
	}
	public String getTipExamen() {
		return tipExamen;
	}
	public void setTipExamen(String tipExamen) {
		this.tipExamen = tipExamen;
	}
	public Long getNumarCredite() {
		return numarCredite;
	}
	public void setNumarCredite(Long numarCredite) {
		this.numarCredite = numarCredite;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
    
}
