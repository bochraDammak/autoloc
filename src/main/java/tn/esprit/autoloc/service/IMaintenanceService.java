package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.maintenance;
import java.util.List;

public interface IMaintenanceService {
    List<maintenance> retrieveAllMaintenances();
    maintenance addMaintenance(maintenance e);
    maintenance updateMaintenance(maintenance e);
    maintenance retrieveMaintenance(Long id);
    void removeMaintenance(Long id);
    List<maintenance> addMaintenances(List<maintenance> list);
}
