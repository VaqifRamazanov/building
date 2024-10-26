package com.matrix.final_project.mapper;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.entity.Agency;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgencyMapper {
    Agency  toAgencyEntity(AgencyRequestDto agencyRequestDto);

    AgencyResponseDto toAgencyResponseDto(Agency agency);

    List<AgencyResponseDto> map(List<Agency> agency);
}
