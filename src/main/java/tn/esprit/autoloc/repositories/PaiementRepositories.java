package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Paiement;
@Repository
public interface PaiementRepositories extends JpaRepository<Paiement,Long> {
}
