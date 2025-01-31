package com.edteam.reservations.operation.intermediate.order;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleOrderExercise  {

    public static void main(String [] args) {
        showReservationsSorted();
    }

    // Ordena una lista de ReservationDTO por su creationDate en orden ascendente.
    public static void showReservationsSorted() {
        List<ReservationDTO> fakeReservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> sortedReservations = getReservationsSorted(fakeReservations);

        System.out.println("Reservas ordenadas por fecha de creacion son:");
        sortedReservations.forEach(System.out::println);
    }

    public static List<ReservationDTO> getReservationsSorted(List<ReservationDTO> reservations) {
        return reservations.stream()
                .sorted(Comparator.comparing(ReservationDTO::getCreationDate))
                .collect(Collectors.toList());
    }
}
