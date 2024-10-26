package com.matrix.final_project.model.dto.responseDto;

import lombok.Data;

@Data
public class LegalComplexResponseDto {

    private Integer id ;
    private String name;
    private String deliveryTime;
    private Integer blockNumber;
    private Integer ceilingHigh;
    private Integer lengthMeasure;
    private Integer totalApartmentNumber;
    private Integer numberApartmentsEachFloor;
    private Integer rankNumber;
    private String conditions;
    private Integer elevatorNumber;
}
