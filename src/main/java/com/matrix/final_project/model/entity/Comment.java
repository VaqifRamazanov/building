package com.matrix.final_project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer constructionCompanyId;
    private String content;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "construction_company_id", nullable = false)
    private ConstructionCompany constructionCompany;
}
