package com.example.voiture.controller;

import com.example.voiture.entity.Voiture;
import com.example.voiture.service.VoitureService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VoitureController {


    @Autowired
    private VoitureService voitureService;

    @GetMapping("/")
    public List<Voiture> findAll() {
        return voitureService.findAll();
    }

    @PostMapping("/")
    public Voiture save(@RequestBody Voiture entity) {
        return voitureService.save(entity);
    }

    @GetMapping("/{aLong}")
    public Optional<Voiture> findById(@PathVariable Long aLong) {
        return voitureService.findById(aLong);
    }

    public void deleteById(Long aLong) {
        voitureService.deleteById(aLong);
    }


}
