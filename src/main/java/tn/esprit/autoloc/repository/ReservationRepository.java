package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.reservation;

@Repository
public interface ReservationRepository extends CrudRepository<reservation, Long> {
}
