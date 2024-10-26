package com.matrix.final_project.model.dto.responseDto;

import lombok.Data;

@Data
public class ConstructionCompanyResponseDto {
    private Integer id;
    private String name;
    private String information;
    private String address;
    private String phoneNumber;
    private String executionPeriod;
    private String serviceName;
    private String price;
}
