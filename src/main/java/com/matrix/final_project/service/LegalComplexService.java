package com.matrix.final_project.service;

import com.matrix.final_project.model.dto.requestDto.LegalComplexRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.LegalComplexResponseDto;
import com.matrix.final_project.model.entity.LegalComplex;

import java.util.List;

public interface LegalComplexService {
    LegalComplexResponseDto add(LegalComplexRequestDto   legalComplexRequestDto);
    LegalComplexResponseDto findById(Integer id);
    LegalComplexResponseDto update(LegalComplexRequestDto  legalComplexRequestDto);
    void delete(Integer id);
    List<LegalComplexResponseDto> findAll();
    List<AnnouncementResponseDto> getAnnouncementByLegalComplex(Integer id);

}
