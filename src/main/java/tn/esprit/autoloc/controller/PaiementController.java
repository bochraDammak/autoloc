package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping("/addPaiement")
    public paiement addPaiement(@RequestBody paiement p) {
        return paiementService.addPaiement(p);
    }

    @PostMapping("/addPaiements")
    public List<paiement> addPaiements(@RequestBody List<paiement> paiements) {
        return paiementService.addPaiements(paiements);
    }

    @GetMapping("/getPaiements")
    public List<paiement> getAllPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @GetMapping("/getPaiement/{id}")
    public paiement getPaiement(@PathVariable Long id) {
        return paiementService.retrievePaiement(id);
    }

    @PutMapping("/updatePaiement")
    public paiement updatePaiement(@RequestBody paiement p) {
        return paiementService.updatePaiement(p);
    }

    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.removePaiement(id);
    }
}
