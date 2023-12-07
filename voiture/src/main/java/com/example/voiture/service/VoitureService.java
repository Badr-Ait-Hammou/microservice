package com.example.voiture.service;

import com.example.voiture.entity.Voiture;
import com.example.voiture.repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepo voitureRepo;

    public List<Voiture> findAll() {
        return voitureRepo.findAll();
    }

    public  Voiture save(Voiture entity) {
        return voitureRepo.save(entity);
    }

    public Optional<Voiture> findById(Long aLong) {
        return voitureRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        voitureRepo.deleteById(aLong);
    }


}
