package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import repositories.CategorieRepositorie;
import repositories.ClientRepositorie;
import repositories.CommandeRepositorie;
import repositories.ProduitRepositorie;
import servicesImplement.CategorieServiceImplement;
import servicesImplement.ClientServiceImplement;
import servicesImplement.CommandeServiceImplement;
import servicesImplement.ProduitServiceImplement;

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
