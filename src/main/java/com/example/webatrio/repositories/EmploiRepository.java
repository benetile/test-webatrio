package com.example.webatrio.repositories;

import com.example.webatrio.model.Emploi;
import com.example.webatrio.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmploiRepository extends JpaRepository<Emploi, Long> {

    Optional<Emploi> findByNom(String nom);
}
