package tn.esprit.autoloc.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idReservation;

     LocalDate dateDebut;

    LocalDate dateFin;


    StatutReservation statut;
    @ManyToOne(fetch = FetchType.LAZY)
    Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    Vehicule vehicule;

    @OneToOne
    @JoinColumn(name = "contrat_id")
    Contrat contrat;

}
