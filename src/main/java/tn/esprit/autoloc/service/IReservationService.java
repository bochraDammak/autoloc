package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.reservation;
import java.util.List;

public interface IReservationService {
    List<reservation> retrieveAllReservations();
    reservation addReservation(reservation e);
    reservation updateReservation(reservation e);
    reservation retrieveReservation(Long id);
    void removeReservation(Long id);
    List<reservation> addReservations(List<reservation> list);
}
