package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.maintenance;

@Repository
public interface MaintenanceRepository extends CrudRepository<maintenance, Long> {
}
