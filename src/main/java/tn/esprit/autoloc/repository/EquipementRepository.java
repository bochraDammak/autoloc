package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.equipement;

@Repository
public interface EquipementRepository extends CrudRepository<equipement, Long> {
}
