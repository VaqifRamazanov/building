package com.matrix.final_project.service;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Agency;


import java.util.List;

public interface AgencyService {
    AgencyResponseDto add(AgencyRequestDto agencyRequestDto);
    AgencyResponseDto findById(Integer id);
    AgencyResponseDto update(AgencyRequestDto agencyRequestDto);
    void delete(Integer id);
    List<AgencyResponseDto> findAll();
     List<AnnouncementResponseDto> getAnnouncementByAgency(Integer id);
}
