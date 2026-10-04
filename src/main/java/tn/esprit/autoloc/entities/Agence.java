package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    Set<Vehicule> vehicules;
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    Set<Employe> employes;
}