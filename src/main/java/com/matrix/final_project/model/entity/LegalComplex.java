package com.matrix.final_project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
@Table(name = "legal_complexes")
public class LegalComplex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private String deliveryTime;
    private Integer blockNumber;
    private Integer ceilingHigh;
    private Integer lengthMeasure;
    private Integer totalApartmentNumber;
    private Integer numberApartmentsEachFloor;
    private Integer rankNumber;
    private String conditions;
    private Integer elevatorNumber;

    @OneToMany(mappedBy = "legalComplex",cascade = CascadeType.ALL,fetch = LAZY)
    private List <Announcement> announcement;

}
