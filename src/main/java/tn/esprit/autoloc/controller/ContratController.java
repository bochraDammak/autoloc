package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    private final IContratService contratService;

    @PostMapping("/addContrat")
    public contrat addContrat(@RequestBody contrat c) {
        return contratService.addContrat(c);
    }

    @PostMapping("/addContrats")
    public List<contrat> addContrats(@RequestBody List<contrat> contrats) {
        return contratService.addContrats(contrats);
    }

    @GetMapping("/getContrats")
    public List<contrat> getAllContrats() {
        return contratService.retrieveAllContrats();
    }

    @GetMapping("/getContrat/{id}")
    public contrat getContrat(@PathVariable Long id) {
        return contratService.retrieveContrat(id);
    }

    @PutMapping("/updateContrat")
    public contrat updateContrat(@RequestBody contrat c) {
        return contratService.updateContrat(c);
    }

    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.removeContrat(id);
    }
}
