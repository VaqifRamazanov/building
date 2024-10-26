package com.matrix.final_project.repository;

import com.matrix.final_project.model.entity.Comment;
import com.matrix.final_project.model.entity.ConstructionCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByConstructionCompany(ConstructionCompany constructionCompany);
}
