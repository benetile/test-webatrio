package com.example.webatrio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "emploi")
public class Emploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emploi_id")
    private Long id;

    private String nom;

    private String poste;

    private Date debut;

    private Date fin;

    @ManyToOne
    //@NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "personne_id")
    @JsonIgnoreProperties(value = "emplois")
    private Personne personne;
}
