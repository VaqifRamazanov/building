package com.matrix.final_project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
@Table(name="agencies")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private String surname;
    private String mail;
    private String phoneNumber;
    private Boolean status;

    @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL,fetch = LAZY)
    private List<Announcement> announcement;
}
