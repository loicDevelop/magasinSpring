package com.example.magasinSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magasinSpring.models.Client;

public interface ClientRepositorie extends JpaRepository<Client, Long> {
	
}