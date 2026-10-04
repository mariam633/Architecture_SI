package tn.esprit.autoloc.entities;
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
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;

     String nom;

    String prenom;

    RoleEmploye role;
    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;
}
