package tn.esprit.autoloc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domaine.client;

@Repository
public interface ClientRepository extends CrudRepository <client ,Long> {

}
