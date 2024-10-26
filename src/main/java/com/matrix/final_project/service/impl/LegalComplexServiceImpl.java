package com.matrix.final_project.service.impl;

import com.matrix.final_project.mapper.AnnouncementMapper;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.repository.AnnouncementRepository;
import com.matrix.final_project.repository.LegalComplexRepository;
import com.matrix.final_project.mapper.LegalComplexMapper;
import com.matrix.final_project.model.dto.requestDto.LegalComplexRequestDto;
import com.matrix.final_project.model.dto.responseDto.LegalComplexResponseDto;
import com.matrix.final_project.model.entity.LegalComplex;
import com.matrix.final_project.service.LegalComplexService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class LegalComplexServiceImpl implements LegalComplexService {
    private final LegalComplexRepository legalComplexRepository;
    private final LegalComplexMapper legalComplexMapper;
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;

    @Override
    public LegalComplexResponseDto add(LegalComplexRequestDto legalComplexRequestDto) {
        LegalComplex legalComplex=legalComplexMapper.toLegalComplexEntity(legalComplexRequestDto);
        legalComplexRepository.save(legalComplex);
        LegalComplexResponseDto legalComplexResponseDto =legalComplexMapper.toLegalComplexDto(legalComplex);
        return legalComplexResponseDto;
    }

    @Override
    public LegalComplexResponseDto findById(Integer id) {

        LegalComplex legalComplex= legalComplexRepository.findById(id).orElseThrow(NullPointerException :: new);
        LegalComplexResponseDto legalComplexResponseDto =legalComplexMapper.toLegalComplexDto(legalComplex);
        return legalComplexResponseDto;
    }

    @Override
    public LegalComplexResponseDto update(LegalComplexRequestDto legalComplexRequestDto) {
        LegalComplex legalComplex=legalComplexMapper.toLegalComplexEntity(legalComplexRequestDto);
        legalComplexRepository.save(legalComplex);
        LegalComplexResponseDto legalComplexResponseDto =legalComplexMapper.toLegalComplexDto(legalComplex);
        return legalComplexResponseDto;
    }

    @Override
    public void delete(Integer id) {

        legalComplexRepository.deleteById(id);
    }

    @Override
    public List<LegalComplexResponseDto> findAll() {
        List<LegalComplex> legalComplex= legalComplexRepository.findAll();
        List<LegalComplexResponseDto> legalComplexResponseDto =legalComplexMapper.map(legalComplex);
        return legalComplexResponseDto;
    }


//    @Override
//    public List<AnnouncementResponseDto> getAnnouncementByLegalComplex(Integer id) {
//        LegalComplex legalComplex=legalComplexRepository.findById(id).orElseThrow(NullPointerException::new);
//         List<AnnouncementResponseDto> announcementResponseDto
//                 =announcementRepository.findByLegalComplex(legalComplex).stream()
//                 .map(announcement -> announcementMapper.toAnnouncementResponseDto(announcement))
//                 .collect(Collectors.toList());
//         return announcementResponseDto;
//    }
}
