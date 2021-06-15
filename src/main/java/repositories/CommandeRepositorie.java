package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Client;

public interface CommandeRepositorie extends JpaRepository<Client, Long> {
	
}