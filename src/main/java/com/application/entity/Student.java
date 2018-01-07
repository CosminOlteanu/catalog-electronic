package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "S_ID")
	private Long id;

	@Column(name = "S_NUME")
    private String nume;

	@Column(name = "S_PRENUME")
	private String prenume;

	@Column(name = "S_CNP")
	private String cnp;

	@Column(name = "S_G_ID", updatable = false, insertable = false)
	private Long groupaId;

	@JoinColumn(name = "S_G_ID")
	@ManyToOne
	private Grupa grupa;

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

	public Long getGroupaId() {
		return groupaId;
	}

	public void setGroupaId(Long groupaId) {
		this.groupaId = groupaId;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}
    
}

