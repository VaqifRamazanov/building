package com.matrix.final_project.service.impl;

import com.matrix.final_project.repository.AnnouncementRepository;
import com.matrix.final_project.mapper.AnnouncementMapper;
import com.matrix.final_project.model.dto.requestDto.AnnouncementRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Announcement;
import com.matrix.final_project.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;

    @Override
    public AnnouncementResponseDto add(AnnouncementRequestDto announcementRequestDto) {
         Announcement announcement=announcementMapper.toAnnouncementEntity(announcementRequestDto);
         announcementRepository.save(announcement);
        AnnouncementResponseDto announcementResponseDto =announcementMapper.toAnnouncementResponseDto(announcement);
        return announcementResponseDto;
    }

    @Override
    public AnnouncementResponseDto findById(Integer id) {
        Announcement announcement= announcementRepository.findById(id).orElseThrow(NullPointerException::new);
        AnnouncementResponseDto announcementResponseDto =announcementMapper.toAnnouncementResponseDto(announcement);
        return announcementResponseDto;

    }

    @Override
    public AnnouncementResponseDto update(AnnouncementRequestDto announcementRequestDto) {
        Announcement announcement= announcementMapper.toAnnouncementEntity(announcementRequestDto);
        announcementRepository.save(announcement);
        AnnouncementResponseDto announcementResponseDto =announcementMapper.toAnnouncementResponseDto(announcement);
        return announcementResponseDto;
    }

    @Override
    public void delete(Integer id) {
        announcementRepository.deleteById(id);
    }

    @Override
    public List<AnnouncementResponseDto> findAll() {
        List<Announcement> announcements= announcementRepository.findAll();
        List <AnnouncementResponseDto> announcementResponseDto =announcementMapper
                .map(announcements);
        return announcementResponseDto;
    }
}
