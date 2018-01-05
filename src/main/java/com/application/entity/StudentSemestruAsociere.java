package com.application.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "STUDENT_SEMESTRU_ASOCIERE")
public class StudentSemestruAsociere {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SSM_ID")
	private Long id;

    @Column(name = "SSM_IN_CURS")
	private Boolean inCurs;

	@Column(name = "SSM_S_ID")
    private Long studentId;

	@Column(name = "SSM_SM_ID")
	private Long semestruId;
    
}

