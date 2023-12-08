package com.example.webatrio.controllers;

import com.example.webatrio.Service.PersonneService;
import com.example.webatrio.model.Personne;
import com.example.webatrio.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/personne")
@CrossOrigin
public class PersonneController {

    @Autowired
    private PersonneService personneService;
    @Autowired
    private PersonneRepository personneRepository;

    @PostMapping("/add")
    public Personne addPersonne(@RequestBody Personne personne){
        return personneService.addPersonne(personne);
    }

    @GetMapping("/")
    public List<Personne> getAllPersonnes(){
        return personneService.calculAllPersonnesAndReturnByOrder();
    }

    @GetMapping("/nom-emploi/{nom}")
    public List<Personne> getPersonneByEmploiname(@PathVariable("nom") String nom){
        return personneRepository.findByEmploisNom(nom);
    }

    @GetMapping("/date/{debut}/{fin}")
    public List<Personne> getPersonneBetweenDate(@PathVariable("debut") Date debut, @PathVariable("fin") Date fin){
        return personneRepository.findByEmploisDebutBetween(debut,fin);
    }

}
