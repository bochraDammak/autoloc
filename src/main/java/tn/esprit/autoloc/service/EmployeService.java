package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    
    private final EmployeRepository repo;

    @Override
    public List<employe> retrieveAllEmployes() {
        return (List<employe>) repo.findAll();
    }

    @Override
    public employe addEmploye(employe e) {
        return repo.save(e);
    }

    @Override
    public employe updateEmploye(employe e) {
        return repo.save(e);
    }

    @Override
    public employe retrieveEmploye(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeEmploye(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<employe> addEmployes(List<employe> list) {
        return (List<employe>) repo.saveAll(list);
    }
}
