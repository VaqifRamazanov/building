package com.matrix.final_project.repository;

import com.matrix.final_project.model.entity.Agency;
import com.matrix.final_project.model.entity.Announcement;
import com.matrix.final_project.model.entity.ConstructionCompany;
import com.matrix.final_project.model.entity.LegalComplex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
    List<Announcement> findByAgency(Agency agency);
    List<Announcement> findByLegalComplex(LegalComplex legalComplex);
    List<Announcement> findByConstructionCompany(ConstructionCompany constructionCompany);
}
