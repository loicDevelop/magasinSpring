package com.example.magasinSpring.servicesImplement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Commande;

public class CommandeServiceImplement extends GenericServiceImplement<Commande> {

	public CommandeServiceImplement(JpaRepository<Commande, Long> repository) {
		super(repository);
	}
}

