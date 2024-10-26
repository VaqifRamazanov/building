package com.matrix.final_project.mapper;

import com.matrix.final_project.model.dto.requestDto.ConstructionCompanyRequestDto;
import com.matrix.final_project.model.dto.responseDto.ConstructionCompanyResponseDto;
import com.matrix.final_project.model.dto.responseDto.LegalComplexResponseDto;
import com.matrix.final_project.model.entity.ConstructionCompany;
import com.matrix.final_project.model.entity.LegalComplex;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ConstructionCompanyMapper {
    ConstructionCompany toConstructionCompanyEntity(ConstructionCompanyRequestDto constructionCompanyRequestDto);
    ConstructionCompanyResponseDto toConstructionCompanyDto(ConstructionCompany constructionCompany);
    List<ConstructionCompanyResponseDto> map(List<ConstructionCompany> constructionCompanies);
}
