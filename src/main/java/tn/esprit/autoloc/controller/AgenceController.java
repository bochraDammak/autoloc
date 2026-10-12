package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/addAgence")
    public agence addAgence(@RequestBody agence a) {
        return agenceService.addAgence(a);
    }

    @PostMapping("/addAgences")
    public List<agence> addAgences(@RequestBody List<agence> agences) {
        return agenceService.addAgences(agences);
    }

    @GetMapping("/getAgences")
    public List<agence> getAllAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/getAgence/{id}")
    public agence getAgence(@PathVariable Long id) {
        return agenceService.retrieveAgence(id);
    }

    @PutMapping("/updateAgence")
    public agence updateAgence(@RequestBody agence a) {
        return agenceService.updateAgence(a);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }
}
