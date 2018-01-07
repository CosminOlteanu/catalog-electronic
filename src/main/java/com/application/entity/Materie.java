package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "MATERIE")
public class Materie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "M_ID")
	private Long id;

	@Column(name = "M_NUME")
    private String nume;

	@Column(name = "M_TIP")
	private String tip;

	@Column(name = "M_NR_CREDITE")
	private Long nrCredite;

	@Column(name = "M_P_ID")
	private Long profesorId;

	@Column(name = "M_G_ID")
	private Long groupaId;

	@Column(name = "M_SM_ID")
	private Long semestruId;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "materie", fetch = FetchType.LAZY)
	private Nota nota;

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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Long getNrCredite() {
		return nrCredite;
	}

	public void setNrCredite(Long nrCredite) {
		this.nrCredite = nrCredite;
	}

	public Long getProfesorId() {
		return profesorId;
	}

	public void setProfesorId(Long profesorId) {
		this.profesorId = profesorId;
	}

	public Long getGroupaId() {
		return groupaId;
	}

	public void setGroupaId(Long groupaId) {
		this.groupaId = groupaId;
	}

	public Long getSemestruId() {
		return semestruId;
	}

	public void setSemestruId(Long semestruId) {
		this.semestruId = semestruId;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}


}

