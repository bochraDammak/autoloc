package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    
    private final MaintenanceRepository repo;

    @Override
    public List<maintenance> retrieveAllMaintenances() {
        return (List<maintenance>) repo.findAll();
    }

    @Override
    public maintenance addMaintenance(maintenance e) {
        return repo.save(e);
    }

    @Override
    public maintenance updateMaintenance(maintenance e) {
        return repo.save(e);
    }

    @Override
    public maintenance retrieveMaintenance(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeMaintenance(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<maintenance> addMaintenances(List<maintenance> list) {
        return (List<maintenance>) repo.saveAll(list);
    }
}
