package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Client;

public interface ProduitRepositorie extends JpaRepository<Client, Long> {
	
}