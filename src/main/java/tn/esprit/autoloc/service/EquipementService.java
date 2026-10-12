package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    
    private final EquipementRepository repo;

    @Override
    public List<equipement> retrieveAllEquipements() {
        return (List<equipement>) repo.findAll();
    }

    @Override
    public equipement addEquipement(equipement e) {
        return repo.save(e);
    }

    @Override
    public equipement updateEquipement(equipement e) {
        return repo.save(e);
    }

    @Override
    public equipement retrieveEquipement(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeEquipement(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<equipement> addEquipements(List<equipement> list) {
        return (List<equipement>) repo.saveAll(list);
    }
}
