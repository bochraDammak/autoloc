package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/addEquipement")
    public equipement addEquipement(@RequestBody equipement e) {
        return equipementService.addEquipement(e);
    }

    @PostMapping("/addEquipements")
    public List<equipement> addEquipements(@RequestBody List<equipement> equipements) {
        return equipementService.addEquipements(equipements);
    }

    @GetMapping("/getEquipements")
    public List<equipement> getAllEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @GetMapping("/getEquipement/{id}")
    public equipement getEquipement(@PathVariable Long id) {
        return equipementService.retrieveEquipement(id);
    }

    @PutMapping("/updateEquipement")
    public equipement updateEquipement(@RequestBody equipement e) {
        return equipementService.updateEquipement(e);
    }

    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.removeEquipement(id);
    }
}
