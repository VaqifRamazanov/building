package com.matrix.final_project.mapper;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.requestDto.CommentRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import com.matrix.final_project.model.entity.Agency;
import com.matrix.final_project.model.entity.Comment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    Comment toCommentEntity(CommentRequestDto commentRequestDto);

    CommentResponseDto toCommentResponseDto(Comment comment);

    List<CommentResponseDto> map(List<Comment> comment);
}
