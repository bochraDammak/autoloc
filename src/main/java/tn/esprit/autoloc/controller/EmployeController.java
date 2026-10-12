package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/addEmploye")
    public employe addEmploye(@RequestBody employe e) {
        return employeService.addEmploye(e);
    }

    @PostMapping("/addEmployes")
    public List<employe> addEmployes(@RequestBody List<employe> employes) {
        return employeService.addEmployes(employes);
    }

    @GetMapping("/getEmployes")
    public List<employe> getAllEmployes() {
        return employeService.retrieveAllEmployes();
    }

    @GetMapping("/getEmploye/{id}")
    public employe getEmploye(@PathVariable Long id) {
        return employeService.retrieveEmploye(id);
    }

    @PutMapping("/updateEmploye")
    public employe updateEmploye(@RequestBody employe e) {
        return employeService.updateEmploye(e);
    }

    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.removeEmploye(id);
    }
}
