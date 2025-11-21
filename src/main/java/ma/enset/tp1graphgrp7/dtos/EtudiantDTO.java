package ma.enset.tp1graphgrp7.dtos;

import ma.enset.tp1graphgrp7.enums.Genre;

public record EtudiantDTO(String nom,
                          String prenom,
                          Genre genre,
                          Long centreId) {
}
