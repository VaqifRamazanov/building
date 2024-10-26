package com.matrix.final_project.service;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.requestDto.ConstructionCompanyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import com.matrix.final_project.model.dto.responseDto.ConstructionCompanyResponseDto;

import java.util.List;

public interface ConstructionCompanyService {
    ConstructionCompanyResponseDto add(ConstructionCompanyRequestDto constructionCompanyRequestDto);
    ConstructionCompanyResponseDto findById(Integer id);
    ConstructionCompanyResponseDto update(ConstructionCompanyRequestDto constructionCompanyRequestDto);
    void delete(Integer id);
    List<ConstructionCompanyResponseDto> findAll();
    List<AnnouncementResponseDto> getAnnouncementByConstructionCompany(Integer id);
    List<CommentResponseDto> getCommentBYConstructionCompany(Integer id);
}
