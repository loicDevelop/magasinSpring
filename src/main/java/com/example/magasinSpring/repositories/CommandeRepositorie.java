package com.example.magasinSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Commande;

public interface CommandeRepositorie extends JpaRepository<Commande, Long> {
	
}