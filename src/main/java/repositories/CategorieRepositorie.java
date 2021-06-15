package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Client;

public interface CategorieRepositorie extends JpaRepository<Client, Long> {
	
}