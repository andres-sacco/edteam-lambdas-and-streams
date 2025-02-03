package com.edteam.reservations.operation.terminal.reduce;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinExercise {

    public static void main(String []args) {
        showTotalPrice();
    }

    // Usar in para obtener el ReservationDTO con la fecha de creación más antigua.
    private static void showTotalPrice() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        Optional<ReservationDTO> latest = getLatestReservation(reservations);

        latest.ifPresent(reservation ->
                System.out.println("La reserva más antigua fue creada el: " + reservation.getCreationDate())
        );
    }

    private static Optional<ReservationDTO> getLatestReservation(List<ReservationDTO> reservations) {
        return reservations.stream()
                .min(Comparator.comparing(ReservationDTO::getCreationDate));
    }
}
