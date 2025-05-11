package com.bibliotheque.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bibliotheque.gestion.model.Auteur;
import com.bibliotheque.gestion.repository.AuteurRepository;

@Service
public class AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public Auteur creerAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public List<Auteur> listerAuteurs() {
        return auteurRepository.findAll();
    }

    public Auteur trouverAuteurParId(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }
}
