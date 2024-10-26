package com.matrix.final_project.model.dto.requestDto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentRequestDto {
    private Integer id;
    private Integer ConstructionCompanyId;
    private String content;
    private LocalDateTime createdAt;
}
