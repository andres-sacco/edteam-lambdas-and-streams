package com.edteam.reservations.operation.terminal.search;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;

public class AllMatchExercise {
    public static void main(String[] args) {
        showReservationWithOnePassenger();
    }

    // Usar allMatch en ReservationDTO para confirmar que cada reserva contiene al menos un PassengerDTO.
    public static void showReservationWithOnePassenger() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        boolean allHavePassengers = getReservationWithOnePassenger(reservations);
        System.out.println("¿Todas las reservas tienen al menos un pasajero?: " + allHavePassengers);
    }

    private static boolean getReservationWithOnePassenger(List<ReservationDTO> reservations) {
        return reservations.stream()
                .allMatch(reservation -> !reservation.getPassengers().isEmpty());
    }
}
