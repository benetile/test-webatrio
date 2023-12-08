package com.example.webatrio.Service;

import com.example.webatrio.model.Emploi;
import com.example.webatrio.model.Personne;
import com.example.webatrio.repositories.EmploiRepository;
import com.example.webatrio.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private EmploiRepository emploiRepository;
    @Autowired
    private EmploiService emploiService;

    public Personne addPersonne(Personne personne){
        Date now = new Date();
        int year = now.getYear() - personne.getDateDeNaissance().getYear();
        try {
            if (year<150){
                personne.getEmplois().stream().forEach(emploi -> {
                    emploiService.save(emploi);
                    System.out.println("sauvegarde de l'emploi : "+emploi.getNom());
                });
                personneRepository.save(personne);
                personne.getEmplois().stream().forEach(emploi -> {
                    emploi.setPersonne(personne);
                    emploiRepository.save(emploi);
                });
                System.out.println("Fin de la sauvegarde");
                return personne;
            }else
                throw new IllegalArgumentException("La personne à plus de 150 ans");
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Personne> calculAllPersonnesAndReturnByOrder(){
        List<Personne> personnes = personneRepository.findAllByOrderByNomAsc();
        Date now = new Date();
        personnes.stream().forEach(personne -> {
            personne.setAge(now.getYear() - personne.getDateDeNaissance().getYear());
        });
        return personnes;
    }

}
