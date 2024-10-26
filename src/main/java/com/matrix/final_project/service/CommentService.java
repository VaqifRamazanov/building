package com.matrix.final_project.service;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.requestDto.CommentRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {
    CommentResponseDto add(CommentRequestDto commentRequestDto);
    CommentResponseDto findById(Integer id);
    CommentResponseDto update(CommentRequestDto commentRequestDto);
    void delete(Integer id);
    List<CommentResponseDto> findAll();

}
