package com.bibliotheque.gestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotheque.gestion.model.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByAuteurId(Long auteurId); // pour afficher les livres d’un auteur
}
