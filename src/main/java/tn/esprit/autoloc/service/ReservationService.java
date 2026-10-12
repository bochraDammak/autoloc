package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domaine.reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    
    private final ReservationRepository repo;

    @Override
    public List<reservation> retrieveAllReservations() {
        return (List<reservation>) repo.findAll();
    }

    @Override
    public reservation addReservation(reservation e) {
        return repo.save(e);
    }

    @Override
    public reservation updateReservation(reservation e) {
        return repo.save(e);
    }

    @Override
    public reservation retrieveReservation(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void removeReservation(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<reservation> addReservations(List<reservation> list) {
        return (List<reservation>) repo.saveAll(list);
    }
}
