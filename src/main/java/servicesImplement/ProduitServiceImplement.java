package servicesImplement;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Produit;

public class ProduitServiceImplement extends GenericServiceImplement<Produit> {

	public ProduitServiceImplement(JpaRepository<Produit, Long> repository) {
		super(repository);
	}
}