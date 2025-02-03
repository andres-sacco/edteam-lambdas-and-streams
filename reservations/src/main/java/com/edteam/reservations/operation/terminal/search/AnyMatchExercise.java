package com.edteam.reservations.operation.terminal.search;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;

public class AnyMatchExercise {
    public static void main(String[] args) {
        showAnyMatchPassenger();
    }

    // Usar anyMatch en ReservationDTO para determinar si al menos una tiene passengers.size() mayor a 5.
    public static void showAnyMatchPassenger() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        boolean hasLargeReservation = getReservationWithLargePassengers(reservations);
        System.out.println("¿Existe una reserva con más de 5 pasajeros?: " + hasLargeReservation);
    }

    private static boolean getReservationWithLargePassengers(List<ReservationDTO> reservations) {
        return reservations.stream()
                .anyMatch(reservation -> reservation.getPassengers().size() > 5);
    }
}
