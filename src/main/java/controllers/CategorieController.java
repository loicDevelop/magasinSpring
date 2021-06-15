package controllers;

import models.Categorie;
import servicesImplement.CategorieServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategorieController {

    @Autowired
    private CategorieServiceImplement service;

    @GetMapping("")
    public List<Categorie> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Categorie findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Categorie save(@RequestBody Categorie cat) {
        return this.service.save(cat);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}