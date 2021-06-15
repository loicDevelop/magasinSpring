package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Client;

public interface ClientRepositorie extends JpaRepository<Client, Long> {
	
}