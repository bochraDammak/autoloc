package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    
    private final ContratRepository repo;

    @Override
    public List<contrat> retrieveAllContrats() {
        return (List<contrat>) repo.findAll();
    }

    @Override
    public contrat addContrat(contrat e) {
        return repo.save(e);
    }

    @Override
    public contrat updateContrat(contrat e) {
        return repo.save(e);
    }

    @Override
    public contrat retrieveContrat(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeContrat(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<contrat> addContrats(List<contrat> list) {
        return (List<contrat>) repo.saveAll(list);
    }
}
