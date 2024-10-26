package com.matrix.final_project.repository;

import com.matrix.final_project.model.entity.LegalComplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalComplexRepository extends JpaRepository<LegalComplex,Integer> {
LegalComplex findByName(String name);
}
