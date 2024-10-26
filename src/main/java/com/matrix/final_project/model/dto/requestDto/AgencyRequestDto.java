package com.matrix.final_project.model.dto.requestDto;

import lombok.Data;

@Data
public class AgencyRequestDto {
    private Integer id ;
    private String name;
    private String surname;
    private String mail;
    private String phoneNumber;
    private Boolean status;
}
