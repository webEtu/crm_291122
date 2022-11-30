package com.example.crm.service;

import com.example.crm.dao.ClientRepository;
import com.example.crm.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientDirectory {

    @Autowired
    private ClientRepository clientRepository;

    public void addClient(Client newClient) {

        clientRepository.save(newClient);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }


}
