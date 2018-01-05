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
}
