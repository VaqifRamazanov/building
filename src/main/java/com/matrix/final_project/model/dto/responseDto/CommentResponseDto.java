package com.matrix.final_project.model.dto.responseDto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponseDto {
    private Integer id;
    private Integer ConstructionCompanyId;
    private String content;
    private LocalDateTime createdAt;
}
