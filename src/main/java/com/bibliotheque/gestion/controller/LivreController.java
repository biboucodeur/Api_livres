package com.bibliotheque.gestion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.gestion.model.Livre;
import com.bibliotheque.gestion.service.LivreService;

@RestController
@RequestMapping("/api/livres")
@CrossOrigin(origins = "*")
public class LivreController {

    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @PostMapping("/{auteurId}")
    public Livre creerLivre(@PathVariable Long auteurId, @RequestBody Livre livre) {
        return livreService.creerLivre(livre, auteurId);
    }

    @GetMapping
    public List<Livre> listerLivres() {
        return livreService.listerLivres();
    }

    @GetMapping("/auteur/{auteurId}")
    public List<Livre> livresParAuteur(@PathVariable Long auteurId) {
        return livreService.livresParAuteur(auteurId);
    }

    @PutMapping("/{id}")
    public Livre modifierLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.modifierLivre(id, livre);
    }

    @DeleteMapping("/{id}")
    public void supprimerLivre(@PathVariable Long id) {
        livreService.supprimerLivre(id);
    }
}
