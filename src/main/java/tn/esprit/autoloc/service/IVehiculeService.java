package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.Vehicule;
import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule e);
    Vehicule updateVehicule(Vehicule e);
    Vehicule retrieveVehicule(Long id);
    void removeVehicule(Long id);
    List<Vehicule> addVehicules(List<Vehicule> list);
}
