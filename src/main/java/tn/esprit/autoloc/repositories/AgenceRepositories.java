package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Agence;
@Repository
public interface AgenceRepositories extends JpaRepository<Agence,Long> {

}
