package ma.enset.tp1graphgrp7.repositories;

import ma.enset.tp1graphgrp7.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
