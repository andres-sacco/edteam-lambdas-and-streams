package com.edteam.reservations.operation.terminal.iterator;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorExercise {

    public static void main(String[] args) {
        showCountReservations();
    }

    // Usar un Iterator para recorrer una lista de ReservationDTO y contar cuántas tienen una fecha de creación definida.
    private static void showCountReservations() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        int count = getFilterReservations(reservations, LocalDate.now());

        System.out.println("Reservas con fecha de creación definida: " + count);
    }

    private static int getFilterReservations(List<ReservationDTO> reservations, LocalDate filterDate) {
        int count = 0;
        Iterator<ReservationDTO> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            ReservationDTO reservation = iterator.next();
            if (reservation.getCreationDate() != null) {
                count++;
            }
        }
        return count;
    }
}
