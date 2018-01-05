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
}
