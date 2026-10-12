package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.employe;
import java.util.List;

public interface IEmployeService {
    List<employe> retrieveAllEmployes();
    employe addEmploye(employe e);
    employe updateEmploye(employe e);
    employe retrieveEmploye(Long id);
    void removeEmploye(Long id);
    List<employe> addEmployes(List<employe> list);
}
