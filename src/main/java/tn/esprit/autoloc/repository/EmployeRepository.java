package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.employe;

@Repository
public interface EmployeRepository extends CrudRepository<employe, Long> {
}
