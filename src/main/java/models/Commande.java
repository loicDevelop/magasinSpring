package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity @Table(name="commande")
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private int client;
	
	@ManyToMany
	@JoinTable( name="PRODUIT_COMMAND",
	    joinColumns= @JoinColumn(name="commande", referencedColumnName="id"),
	    inverseJoinColumns= @JoinColumn(name="commandeProduit", referencedColumnName="id")
	)	
	private List<Produit> produits;
}
