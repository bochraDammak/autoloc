package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    
    private final VehiculeRepository repo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) repo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule e) {
        return repo.save(e);
    }

    @Override
    public Vehicule updateVehicule(Vehicule e) {
        return repo.save(e);
    }

    @Override
    public Vehicule retrieveVehicule(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeVehicule(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> list) {
        return (List<Vehicule>) repo.saveAll(list);
    }
}
