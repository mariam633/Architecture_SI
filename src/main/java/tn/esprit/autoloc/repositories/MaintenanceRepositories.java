package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Maintenance;
@Repository
public interface MaintenanceRepositories extends JpaRepository<Maintenance,Long> {
}
