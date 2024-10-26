package com.matrix.final_project.service.impl;

import com.matrix.final_project.mapper.AnnouncementMapper;
import com.matrix.final_project.mapper.CommentMapper;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import com.matrix.final_project.repository.AnnouncementRepository;
import com.matrix.final_project.repository.CommentRepository;
import com.matrix.final_project.repository.ConstructionCompanyRepository;
import com.matrix.final_project.mapper.ConstructionCompanyMapper;
import com.matrix.final_project.model.dto.requestDto.ConstructionCompanyRequestDto;
import com.matrix.final_project.model.dto.responseDto.ConstructionCompanyResponseDto;
import com.matrix.final_project.model.entity.ConstructionCompany;
import com.matrix.final_project.service.ConstructionCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ConstructionCompanyServiceImpl implements ConstructionCompanyService {
    private final ConstructionCompanyMapper constructionCompanyMapper;
    private final ConstructionCompanyRepository constructionCompanyRepository;
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    @Override
    public ConstructionCompanyResponseDto add(ConstructionCompanyRequestDto constructionCompanyRequestDto) {
        ConstructionCompany constructionCompany = constructionCompanyMapper.
                toConstructionCompanyEntity(constructionCompanyRequestDto);
        constructionCompanyRepository.save(constructionCompany);
        ConstructionCompanyResponseDto constructionCompanyResponseDto = constructionCompanyMapper
                .toConstructionCompanyDto(constructionCompany);
        return constructionCompanyResponseDto;
    }

    @Override
    public ConstructionCompanyResponseDto findById(Integer id) {
        ConstructionCompany constructionCompany = constructionCompanyRepository.
                findById(id).orElseThrow(NullPointerException::new);
        ConstructionCompanyResponseDto constructionCompanyResponseDto = constructionCompanyMapper
                .toConstructionCompanyDto(constructionCompany);
        return constructionCompanyResponseDto;
    }

    @Override
    public ConstructionCompanyResponseDto update(ConstructionCompanyRequestDto constructionCompanyRequestDto) {
        ConstructionCompany constructionCompany = constructionCompanyMapper.
                toConstructionCompanyEntity(constructionCompanyRequestDto);
        constructionCompanyRepository.save(constructionCompany);
        ConstructionCompanyResponseDto constructionCompanyResponseDto = constructionCompanyMapper
                .toConstructionCompanyDto(constructionCompany);
        return constructionCompanyResponseDto;
    }

    @Override
    public void delete(Integer id) {
        constructionCompanyRepository.deleteById(id);

    }

    @Override
    public List<ConstructionCompanyResponseDto> findAll() {
        List<ConstructionCompany> constructionCompanies = constructionCompanyRepository.findAll();
        List<ConstructionCompanyResponseDto> constructionCompanyResponseDtos =
                constructionCompanyMapper.map(constructionCompanies);
        return constructionCompanyResponseDtos;
    }
//
//    @Override
//    public List<AnnouncementResponseDto> getAnnouncementByConstructionCompany(Integer id) {
//        ConstructionCompany constructionCompany = constructionCompanyRepository.findById(id).
//                orElseThrow(NullPointerException::new);
//        List<AnnouncementResponseDto> announcementResponseDto = announcementRepository
//                .findByConstructionCompany(constructionCompany).stream()
//                .map(announcement -> announcementMapper.toAnnouncementResponseDto(announcement))
//                .collect(Collectors.toList());
//        return announcementResponseDto;
//    }
//
//    @Override
//    public List<CommentResponseDto> getCommentBYConstructionCompany(Integer id) {
//        ConstructionCompany constructionCompany=constructionCompanyRepository.
//                findById(id).orElseThrow(NullPointerException ::new);
//        List<CommentResponseDto> commentResponseDto=commentRepository
//                .findBYConstructionCompany(constructionCompany).stream()
//                .map(comment -> commentMapper.toCommentResponseDto(comment))
//                .collect(Collectors.toList());
//        return commentResponseDto;
//    }

}
