package com.matrix.final_project.service.impl;


import com.matrix.final_project.repository.AgencyRepository;
import com.matrix.final_project.repository.AnnouncementRepository;
import com.matrix.final_project.mapper.AgencyMapper;
import com.matrix.final_project.mapper.AnnouncementMapper;
import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Agency;

import com.matrix.final_project.service.AgencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AgencyServiceImpl implements AgencyService {
    private final AgencyRepository agencyRepository;
    private final AgencyMapper agencyMapper;
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;
    @Override
    public AgencyResponseDto add(AgencyRequestDto agencyRequestDto) {
            Agency agency=agencyMapper.toAgencyEntity(agencyRequestDto);
            agencyRepository.save(agency);
            AgencyResponseDto agencyResponseDto=agencyMapper.toAgencyResponseDto(agency);
            return agencyResponseDto;
    }

    @Override
    public AgencyResponseDto findById(Integer id) {
        Agency agency= agencyRepository.findById(id).orElseThrow(NullPointerException::new);
        AgencyResponseDto agencyResponseDto =agencyMapper.toAgencyResponseDto(agency);
        return agencyResponseDto;
    }

    @Override
    public AgencyResponseDto update(AgencyRequestDto agencyRequestDto) {
        Agency agency= agencyMapper.toAgencyEntity(agencyRequestDto);
        agencyRepository.save(agency);
        AgencyResponseDto agencyResponseDto =agencyMapper.toAgencyResponseDto(agency);
        return agencyResponseDto;
    }

    @Override
    public void delete(Integer id) {

        agencyRepository.deleteById(id);
    }

    @Override
    public List<AgencyResponseDto> findAll() {

        List<Agency> agencies= agencyRepository.findAll();
        List<AgencyResponseDto> agencyResponseDto =agencyMapper.map(agencies);
        return agencyResponseDto;
    }
//    @Override
//    public List<AnnouncementResponseDto> getAnnouncementByAgency(Integer id){
//    Agency agency=agencyRepository.findById(id).orElseThrow();
//    List<AnnouncementResponseDto> announcementResponseDto
//            =announcementRepository.findByAgency(agency).stream()
//            .map(announcement -> announcementMapper.toAnnouncementResponseDto(announcement))
//            .collect(Collectors.toList());
//    return announcementResponseDto;
//
//    }
}
