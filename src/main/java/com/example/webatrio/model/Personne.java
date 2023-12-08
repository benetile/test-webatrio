package com.example.webatrio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "personne")
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personne_id")
    private Long id;

    private String nom;

    private String prenom;

    private int age;


    private Date dateDeNaissance;
    @OneToMany(targetEntity = Emploi.class, cascade = CascadeType.MERGE, mappedBy = "personne")
    @JsonIgnoreProperties(value ="personne")
    private List<Emploi> emplois;

}
