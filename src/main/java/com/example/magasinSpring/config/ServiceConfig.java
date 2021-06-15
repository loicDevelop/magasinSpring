package com.example.magasinSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.magasinSpring.repositories.CategorieRepositorie;
import com.example.magasinSpring.repositories.ClientRepositorie;
import com.example.magasinSpring.repositories.CommandeRepositorie;
import com.example.magasinSpring.repositories.ProduitRepositorie;
import com.example.magasinSpring.servicesImplement.CategorieServiceImplement;
import com.example.magasinSpring.servicesImplement.ClientServiceImplement;
import com.example.magasinSpring.servicesImplement.CommandeServiceImplement;
import com.example.magasinSpring.servicesImplement.ProduitServiceImplement;

@Configuration
public class ServiceConfig {

    @Bean
    public CategorieServiceImplement categorieServiceFactory(CategorieRepositorie repository) {
        return new CategorieServiceImplement(repository);
    }

    @Bean
    public ClientServiceImplement clientServiceFactory(ClientRepositorie repository) {
        return new ClientServiceImplement(repository);
    }
    
    @Bean
    public CommandeServiceImplement commandeServiceFactory(CommandeRepositorie repository) {
        return new CommandeServiceImplement(repository);
    }
    
    @Bean
    public ProduitServiceImplement produitServiceFactory(ProduitRepositorie repository) {
        return new ProduitServiceImplement(repository);
    }
}
