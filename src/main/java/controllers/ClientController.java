package controllers;

import models.Client;
import servicesImplement.ClientServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientServiceImplement service;

    @GetMapping("")
    public List<Client> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Client findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Client save(@RequestBody Client client) {
        return this.service.save(client);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
