package com.bibliotheque.gestion.controller;

import com.bibliotheque.gestion.model.Auteur;
import com.bibliotheque.gestion.service.AuteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
@CrossOrigin(origins = "*")
public class AuteurController {

    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @PostMapping
    public Auteur creerAuteur(@RequestBody Auteur auteur) {
        return auteurService.creerAuteur(auteur);
    }

    @GetMapping
    public List<Auteur> listerAuteurs() {
        return auteurService.listerAuteurs();
    }
}
