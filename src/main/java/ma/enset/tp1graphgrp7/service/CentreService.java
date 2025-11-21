package ma.enset.tp1graphgrp7.service;

import ma.enset.tp1graphgrp7.model.Centre;
import ma.enset.tp1graphgrp7.model.Etudiant;
import ma.enset.tp1graphgrp7.repositories.CentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentreService {
    @Autowired
    CentreRepository centreRepository;
    public List<Centre> getCentres() {
        return centreRepository.findAll();
    }
    public Centre getCentre(Long id){
        return centreRepository.findById(id).orElse(null);
    }
}
