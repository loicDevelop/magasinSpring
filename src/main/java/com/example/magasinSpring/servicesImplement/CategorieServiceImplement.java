package com.example.magasinSpring.servicesImplement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Categorie;

public class CategorieServiceImplement extends GenericServiceImplement<Categorie> {

	public CategorieServiceImplement(JpaRepository<Categorie, Long> repository) {
		super(repository);
	}
}
