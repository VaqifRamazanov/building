package com.matrix.final_project.model.dto.responseDto;

import lombok.Data;

@Data
public class AgencyResponseDto {
    private Integer id ;
    private String name;
    private String surname;
    private String mail;
    private String phoneNumber;
    private Boolean status;
}
