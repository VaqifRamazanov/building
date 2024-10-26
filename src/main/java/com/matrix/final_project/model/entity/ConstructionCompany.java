package com.matrix.final_project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
@Table(name="construction_companies")
public class ConstructionCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String information;
    private String address;
    private String phoneNumber;
    private String executionPeriod;
    private String serviceName;
    private String price;

    @OneToMany(mappedBy = "comment",cascade = CascadeType.ALL,fetch = LAZY)
    private List<Comment> comment;
}
