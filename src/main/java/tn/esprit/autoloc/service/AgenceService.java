package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    
    private final AgenceRepository repo;

    @Override
    public List<agence> retrieveAllAgences() {
        return (List<agence>) repo.findAll();
    }

    @Override
    public agence addAgence(agence e) {
        return repo.save(e);
    }

    @Override
    public agence updateAgence(agence e) {
        return repo.save(e);
    }

    @Override
    public agence retrieveAgence(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeAgence(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<agence> addAgences(List<agence> list) {
        return (List<agence>) repo.saveAll(list);
    }
}
