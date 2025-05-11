package com.bibliotheque.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotheque.gestion.model.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
