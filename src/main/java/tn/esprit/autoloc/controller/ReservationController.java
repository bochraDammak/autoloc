package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domaine.reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping("/addReservation")
    public reservation addReservation(@RequestBody reservation r) {
        return reservationService.addReservation(r);
    }

    @PostMapping("/addReservations")
    public List<reservation> addReservations(@RequestBody List<reservation> reservations) {
        return reservationService.addReservations(reservations);
    }

    @GetMapping("/getReservations")
    public List<reservation> getAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/getReservation/{id}")
    public reservation getReservation(@PathVariable Long id) {
        return reservationService.retrieveReservation(id);
    }

    @PutMapping("/updateReservation")
    public reservation updateReservation(@RequestBody reservation r) {
        return reservationService.updateReservation(r);
    }

    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.removeReservation(id);
    }
}
