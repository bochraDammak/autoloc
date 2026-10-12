package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.paiement;
import tn.esprit.autoloc.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    
    private final PaiementRepository repo;

    @Override
    public List<paiement> retrieveAllPaiements() {
        return (List<paiement>) repo.findAll();
    }

    @Override
    public paiement addPaiement(paiement e) {
        return repo.save(e);
    }

    @Override
    public paiement updatePaiement(paiement e) {
        return repo.save(e);
    }

    @Override
    public paiement retrievePaiement(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removePaiement(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<paiement> addPaiements(List<paiement> list) {
        return (List<paiement>) repo.saveAll(list);
    }
}
