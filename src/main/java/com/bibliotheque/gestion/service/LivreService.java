package com.bibliotheque.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bibliotheque.gestion.model.Auteur;
import com.bibliotheque.gestion.model.Livre;
import com.bibliotheque.gestion.repository.AuteurRepository;
import com.bibliotheque.gestion.repository.LivreRepository;

@Service
public class LivreService {

    private final LivreRepository livreRepository;
    private final AuteurRepository auteurRepository;

    public LivreService(LivreRepository livreRepository, AuteurRepository auteurRepository) {
        this.livreRepository = livreRepository;
        this.auteurRepository = auteurRepository;
    }

    public Livre creerLivre(Livre livre, Long auteurId) {
        Optional<Auteur> auteurOptional = auteurRepository.findById(auteurId);
        if (auteurOptional.isPresent()) {
            livre.setAuteur(auteurOptional.get());
            return livreRepository.save(livre);
        }
        return null;
    }

    public List<Livre> listerLivres() {
        return livreRepository.findAll();
    }

    public List<Livre> livresParAuteur(Long auteurId) {
        return livreRepository.findByAuteurId(auteurId);
    }

    public Livre modifierLivre(Long id, Livre livreModifie) {
        return livreRepository.findById(id).map(livre -> {
            livre.setTitre(livreModifie.getTitre());
            livre.setGenre(livreModifie.getGenre());
            livre.setAnneePublication(livreModifie.getAnneePublication());
            return livreRepository.save(livre);
        }).orElse(null);
    }

    public void supprimerLivre(Long id) {
        livreRepository.deleteById(id);
    }
}
