package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.contrat;

@Repository
public interface ContratRepository extends CrudRepository<contrat, Long> {
}
