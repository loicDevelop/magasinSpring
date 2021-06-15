package com.example.magasinSpring.controllers;

import com.example.magasinSpring.models.Commande;
import com.example.magasinSpring.servicesImplement.CommandeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commandes")
@CrossOrigin
public class CommandeController {

    @Autowired
    private CommandeServiceImplement service;

    @GetMapping("")
    public List<Commande> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Commande findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Commande save(@RequestBody Commande client) {
        return this.service.save(client);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
