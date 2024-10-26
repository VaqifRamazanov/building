package com.matrix.final_project.model.dto.responseDto;

import lombok.Data;

import java.util.Date;
@Data
public class AnnouncementResponseDto {
    private Integer id ;
    private String city;
    private String area;
    private String orderType;
    private String orderForm;
    private Integer price;
    private String Information;
    private Integer roomNumber;
    private Boolean iron;
    private Boolean landRegister;
    private Boolean mortgage;
    private Integer rankNumber;
    private String address;
    private Date createDate;
}
