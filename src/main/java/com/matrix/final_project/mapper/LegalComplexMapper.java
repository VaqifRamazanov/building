package com.matrix.final_project.mapper;

import com.matrix.final_project.model.dto.requestDto.AnnouncementRequestDto;
import com.matrix.final_project.model.dto.requestDto.LegalComplexRequestDto;
import com.matrix.final_project.model.dto.responseDto.LegalComplexResponseDto;
import com.matrix.final_project.model.entity.Announcement;
import com.matrix.final_project.model.entity.LegalComplex;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LegalComplexMapper {
    LegalComplex toLegalComplexEntity(LegalComplexRequestDto legalComplexRequestDto);
    LegalComplexResponseDto toLegalComplexDto(LegalComplex legalComplex);
    List<LegalComplexResponseDto> map(List<LegalComplex> legalComplex);
}
