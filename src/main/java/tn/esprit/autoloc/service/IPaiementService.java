package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.paiement;
import java.util.List;

public interface IPaiementService {
    List<paiement> retrieveAllPaiements();
    paiement addPaiement(paiement e);
    paiement updatePaiement(paiement e);
    paiement retrievePaiement(Long id);
    void removePaiement(Long id);
    List<paiement> addPaiements(List<paiement> list);
}
