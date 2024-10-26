package com.matrix.final_project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private String area;
    private String orderType;
    private String orderForm;
    private Integer price;
    private String Information;
    private Integer roomNumber;
    private Boolean iron;
    private Boolean landRegister;
    private Boolean mortgage;
    private Integer rankNumber;
    private String address;
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "legal_comlex_id", nullable = false)
    private LegalComplex legalComplex;

    @ManyToOne
    @JoinColumn(name = "agency_id", nullable = false)
    private Agency agency;

}
