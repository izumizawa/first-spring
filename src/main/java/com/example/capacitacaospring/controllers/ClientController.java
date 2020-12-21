package com.example.capacitacaospring.controllers;

import com.example.capacitacaospring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String findAll() {
        return clientService.listAll();
    }
}
