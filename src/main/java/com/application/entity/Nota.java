package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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

	@Column(name = "N_M_ID", updatable = false, insertable = false)
	private Long materieId;

	@JoinColumn(name = "N_M_ID")
	@OneToOne
	private Materie materie;

	@Column(name = "N_DATA")
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValoare() {
		return valoare;
	}

	public void setValoare(String valoare) {
		this.valoare = valoare;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getMaterieId() {
		return materieId;
	}

	public void setMaterieId(Long materieId) {
		this.materieId = materieId;
	}

	public Materie getMaterie() {
		return materie;
	}

	public void setMaterie(Materie materie) {
		this.materie = materie;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
    
}

