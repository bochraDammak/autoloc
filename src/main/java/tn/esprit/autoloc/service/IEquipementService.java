package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.equipement;
import java.util.List;

public interface IEquipementService {
    List<equipement> retrieveAllEquipements();
    equipement addEquipement(equipement e);
    equipement updateEquipement(equipement e);
    equipement retrieveEquipement(Long id);
    void removeEquipement(Long id);
    List<equipement> addEquipements(List<equipement> list);
}
