package com.example.eurikaclient.repository;

import com.example.eurikaclient.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {

}
