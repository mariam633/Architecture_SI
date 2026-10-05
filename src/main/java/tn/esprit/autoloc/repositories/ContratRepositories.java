package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Contrat;
@Repository
public interface ContratRepositories extends JpaRepository<Contrat,Long> {
}
