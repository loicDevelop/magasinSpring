package servicesImplement;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Commande;

public class CommandeServiceImplement extends GenericServiceImplement<Commande> {

	public CommandeServiceImplement(JpaRepository<Commande, Long> repository) {
		super(repository);
	}
}

