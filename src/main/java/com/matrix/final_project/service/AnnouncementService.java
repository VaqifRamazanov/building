package com.matrix.final_project.service;

import com.matrix.final_project.model.dto.requestDto.AnnouncementRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Announcement;

import java.util.List;

public interface AnnouncementService {
    AnnouncementResponseDto add(AnnouncementRequestDto announcementRequestDto);
    AnnouncementResponseDto findById(Integer id);
    AnnouncementResponseDto update(AnnouncementRequestDto announcementRequestDto);
    void delete(Integer id);
    List<AnnouncementResponseDto> findAll();
}
