package com.matrix.final_project.mapper;


import com.matrix.final_project.model.dto.requestDto.AnnouncementRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Announcement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnnouncementMapper {
    Announcement toAnnouncementEntity(AnnouncementRequestDto announcementRequestDto);
    AnnouncementResponseDto toAnnouncementResponseDto(Announcement announcement);
    List<AnnouncementResponseDto> map(List<Announcement> announcement);
}
