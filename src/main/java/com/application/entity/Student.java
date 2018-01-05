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
    
}

