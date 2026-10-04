package tn.esprit.autoloc.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

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


public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;

    LocalDate dateSignature;

    BigDecimal montantTotal;

    boolean valide;
    @OneToOne(mappedBy = "contrat")
    Reservation reservation;

    @OneToMany(
            mappedBy = "contrat",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    Set<Paiement> paiements;

}
