package com.example.magasinSpring.models;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity @Table(name="produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private float prix;
	
	@ManyToOne
	@JoinColumn(name = "id_categorie")
	private Categorie categorie;

}
