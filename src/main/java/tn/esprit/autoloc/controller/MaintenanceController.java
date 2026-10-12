package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/addMaintenance")
    public maintenance addMaintenance(@RequestBody maintenance m) {
        return maintenanceService.addMaintenance(m);
    }

    @PostMapping("/addMaintenances")
    public List<maintenance> addMaintenances(@RequestBody List<maintenance> maintenances) {
        return maintenanceService.addMaintenances(maintenances);
    }

    @GetMapping("/getMaintenances")
    public List<maintenance> getAllMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("/getMaintenance/{id}")
    public maintenance getMaintenance(@PathVariable Long id) {
        return maintenanceService.retrieveMaintenance(id);
    }

    @PutMapping("/updateMaintenance")
    public maintenance updateMaintenance(@RequestBody maintenance m) {
        return maintenanceService.updateMaintenance(m);
    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.removeMaintenance(id);
    }
}
