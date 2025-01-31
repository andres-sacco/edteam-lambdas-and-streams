package com.edteam.reservations.operation.pagination;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class SkipExercise {

    public static void main(String[] args) {
        showReservationsSkipped();
    }

    // Dada una lista de ReservationDTO, obtener una nueva lista omitiendo las primeras 3 reservas.
    public static void showReservationsSkipped() {
        List<ReservationDTO> fakeReservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> sortedReservations = getReservationsSkipped(fakeReservations);

        System.out.println("Reservas que no fueron omitidas son:");
        sortedReservations.forEach(System.out::println);
    }

    public static List<ReservationDTO> getReservationsSkipped(List<ReservationDTO> reservations) {
        return reservations.stream()
                .skip(3)
                .collect(Collectors.toList());
    }
}
