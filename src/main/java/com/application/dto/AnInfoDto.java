package com.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class AnInfoDto {
    private Long an;
    private List<SemestruDto> semestre;
}
