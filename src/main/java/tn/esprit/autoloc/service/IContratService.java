package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.contrat;
import java.util.List;

public interface IContratService {
    List<contrat> retrieveAllContrats();
    contrat addContrat(contrat e);
    contrat updateContrat(contrat e);
    contrat retrieveContrat(Long id);
    void removeContrat(Long id);
    List<contrat> addContrats(List<contrat> list);
}
