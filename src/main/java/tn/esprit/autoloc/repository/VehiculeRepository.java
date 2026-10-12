package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.Vehicule;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
