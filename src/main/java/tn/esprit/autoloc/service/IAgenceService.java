package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.agence;
import java.util.List;

public interface IAgenceService {
    List<agence> retrieveAllAgences();
    agence addAgence(agence e);
    agence updateAgence(agence e);
    agence retrieveAgence(Long id);
    void removeAgence(Long id);
    List<agence> addAgences(List<agence> list);
}
