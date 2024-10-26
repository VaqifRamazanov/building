package com.matrix.final_project.model.dto.requestDto;

import lombok.Data;

@Data
public class ConstructionCompanyRequestDto {
    private Integer id;
    private String name;
    private String information;
    private String address;
    private String phoneNumber;
    private String executionPeriod;
    private String serviceName;
    private String price;
}
