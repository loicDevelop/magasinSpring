package com.example.magasinSpring.servicesImplement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Client;

public class ClientServiceImplement extends GenericServiceImplement<Client> {

	public ClientServiceImplement(JpaRepository<Client, Long> repository) {
		super(repository);
	}


}
