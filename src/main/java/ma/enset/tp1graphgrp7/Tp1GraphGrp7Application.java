package ma.enset.tp1graphgrp7;

import ma.enset.tp1graphgrp7.enums.Genre;
import ma.enset.tp1graphgrp7.model.Centre;
import ma.enset.tp1graphgrp7.model.Etudiant;
import ma.enset.tp1graphgrp7.repositories.CentreRepository;
import ma.enset.tp1graphgrp7.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1GraphGrp7Application  implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp1GraphGrp7Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Centre centre1=Centre.builder()
                .nom("Maarif")
                .adresse("Biranzarane")
                .build();
        centreRepository.save(centre1);
        Centre centre2= Centre.builder()
                .nom("Oranges")
                .adresse("Oulfa")
                .build();
        centreRepository.save(centre2);
        Etudiant et1=Etudiant.builder()
                .nom("Adnani").
                prenom("Brahim").
                genre(Genre.Homme)
                .centre(centre1).
                build();
        etudiantRepository.save(et1);
        Etudiant et2 = Etudiant.builder()
                .nom("El Amrani")
                .prenom("Sara")
                .genre(Genre.Femme)
                .centre(centre2)
                .build();
        etudiantRepository.save(et2);
    }
}






