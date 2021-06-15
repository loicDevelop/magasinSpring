package com.example.magasinSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Categorie;

public interface CategorieRepositorie extends JpaRepository<Categorie, Long> {
	
}