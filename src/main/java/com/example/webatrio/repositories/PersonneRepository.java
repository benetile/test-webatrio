package com.example.webatrio.repositories;

import com.example.webatrio.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {

    Optional<Personne> findByNomAndPrenom(String nom, String prenom);

    List<Personne> findAllByOrderByNomAsc();

    List<Personne> findByEmploisNom(String nom);

   List<Personne> findByEmploisDebutBetween(Date debut, Date fin);


}
