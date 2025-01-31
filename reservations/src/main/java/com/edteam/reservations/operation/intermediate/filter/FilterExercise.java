package com.edteam.reservations.operation.intermediate.filter;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExercise {

    public static void main(String [] args) {
        showReservationsLastMonth();
    }

    // Filtrar reservas creadas en el último mes.
    public static void showReservationsLastMonth() {
        List<ReservationDTO> fakeReservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> recentReservations = getRecentReservations(fakeReservations);

        if(!recentReservations.isEmpty()) {
            System.out.println("Reservas creadas en el último mes:");
            recentReservations.forEach(System.out::println);
        } else {
            System.out.println("No hay reservas creadas en el último mes");
        }
    }

    public static List<ReservationDTO> getRecentReservations(List<ReservationDTO> reservations) {
        return reservations.stream()
                .filter(reservation -> reservation.getCreationDate().isAfter(LocalDate.now().minusMonths(1)))
                .collect(Collectors.toList());
    }
}
