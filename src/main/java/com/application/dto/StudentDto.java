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
}
