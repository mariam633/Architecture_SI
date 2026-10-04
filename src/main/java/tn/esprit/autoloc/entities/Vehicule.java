package tn.esprit.autoloc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idVehicule;

    String immatriculation;

     String marque;

    String modele;

    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    StatutVehicule statut;
    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;
    @ManyToMany(fetch = FetchType.LAZY)
    Set<Equipement> equipements;
}

