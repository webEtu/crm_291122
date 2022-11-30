package com.example.crm.controller;

import com.example.crm.model.Client;
import com.example.crm.service.ClientDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ClientController {

    @Autowired
    private ClientDirectory  clientDirectory;

    @GetMapping("clients")
    public List<Client> getClients() {
        return clientDirectory.getClients();
    }

    @GetMapping("clients/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") Integer id) {
        Optional<Client> optionalClient = clientDirectory.getClient(id);
        if(optionalClient.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(optionalClient.get());
        }
    }

    @PostMapping("clients")
    public Client postClient(@RequestBody Client newClient) {
        clientDirectory.addClient(newClient);
        return newClient;
    }


}
