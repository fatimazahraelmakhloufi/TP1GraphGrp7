package ma.enset.tp1graphgrp7.mappers;

import ma.enset.tp1graphgrp7.dtos.EtudiantDTO;
import ma.enset.tp1graphgrp7.model.Centre;
import ma.enset.tp1graphgrp7.model.Etudiant;
import ma.enset.tp1graphgrp7.repositories.CentreRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class DtoToEtudiant {
    @Autowired
    CentreRepository centreRepository;
    public void toEtudiant(Etudiant etudiant, EtudiantDTO etudiantDTO) {
        Centre centre= centreRepository.findById(etudiantDTO.centreId()).orElse(null);
        if (etudiantDTO != null) {
            BeanUtils.copyProperties(etudiantDTO,etudiant);
            etudiant.setCentre(centre);
        }
    }

}
