package com.edteam.reservations.operation.terminal.search;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.Optional;

public class FindFirstExercise {
    public static void main(String[] args) {
        showFirstReservation();
    }

    // Usar findFirst para obtener la primera ReservationDTO cuyo creationDate sea distinto de nulo.
    public static void showFirstReservation() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();

        Optional<ReservationDTO> firstValidReservation = getFirstReservation(reservations);

        firstValidReservation.ifPresent(reservation ->
                System.out.println("Primera reserva con fecha de creación: " + reservation.getCreationDate())
        );
    }

    private static Optional<ReservationDTO> getFirstReservation(List<ReservationDTO> reservations) {
        return reservations.stream()
                .filter(reservation -> reservation.getCreationDate() != null)
                .findFirst();
    }
}
