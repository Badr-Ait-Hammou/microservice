package com.example.eurikaclient.service;

import com.example.eurikaclient.entity.Client;
import com.example.eurikaclient.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Clientservice {

    @Autowired
    private ClientRepo clientRepo;

    public Optional<Client> findById(Long id) {
        return clientRepo.findById(id);
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    public Client save(Client client) {
        return clientRepo.save(client);
    }



    public void deleteById(Long id) {
        clientRepo.deleteById(id);
    }



}
