package controllers;

import models.Produit;
import servicesImplement.ProduitServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitController {

    @Autowired
    private ProduitServiceImplement service;

    @GetMapping("")
    public List<Produit> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Produit findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Produit save(@RequestBody Produit cat) {
        return this.service.save(cat);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}