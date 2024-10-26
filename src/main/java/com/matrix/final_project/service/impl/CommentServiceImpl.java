package com.matrix.final_project.service.impl;

import com.matrix.final_project.repository.CommentRepository;
import com.matrix.final_project.mapper.CommentMapper;
import com.matrix.final_project.model.dto.requestDto.CommentRequestDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import com.matrix.final_project.model.entity.Comment;
import com.matrix.final_project.service.CommentService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class CommentServiceImpl implements CommentService {
    private final CommentMapper commentMapper ;
    private final CommentRepository commentRepository;

    @Override
    public CommentResponseDto add(CommentRequestDto commentRequestDto) {
        Comment comment=commentMapper.toCommentEntity(commentRequestDto);
        commentRepository.save(comment);
        CommentResponseDto commentResponseDto=commentMapper.toCommentResponseDto(comment);
        return commentResponseDto;
    }

    @Override
    public CommentResponseDto findById(Integer id) {
        Comment comment= commentRepository.findById(id).orElseThrow(NullPointerException::new);
        CommentResponseDto commentResponseDto =commentMapper.toCommentResponseDto(comment);
        return commentResponseDto;
    }

    @Override
    public CommentResponseDto update(CommentRequestDto commentRequestDto) {
        Comment comment=commentMapper.toCommentEntity(commentRequestDto);
        commentRepository.save(comment);
        CommentResponseDto commentResponseDto=commentMapper.toCommentResponseDto(comment);
        return commentResponseDto;
    }

    @Override
    public void delete(Integer id) {
    commentRepository.deleteById(id);
    }

    @Override
    public List<CommentResponseDto> findAll() {
        List<Comment> comments= commentRepository.findAll();
        List<CommentResponseDto> commentResponseDto =commentMapper.map(comments);
        return commentResponseDto;
    }
}
