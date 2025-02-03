package com.edteam.reservations.operation.terminal.iterator;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PeekExercise {

    public static void main(String[] args) {
        showCountReservations();
    }

    // Usar peek en un stream de ReservationDTO para imprimir el id de cada reserva mientras se filtra por una condición de fecha.
    private static void showCountReservations() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> result = getFilterReservations(reservations, LocalDate.now());

        System.out.println("Reservas filtradas: " + result.size());
    }

    private static List<ReservationDTO> getFilterReservations(List<ReservationDTO> reservations, LocalDate filterDate) {
        return reservations.stream()
                .peek(reservation -> System.out.println("Procesando reserva ID: " + reservation.getId()))
                .filter(reservation -> reservation.getCreationDate().isAfter(filterDate))
                .collect(Collectors.toList());
    }
}
