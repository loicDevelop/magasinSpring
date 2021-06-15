package com.example.magasinSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Produit;

public interface ProduitRepositorie extends JpaRepository<Produit, Long> {
	
}