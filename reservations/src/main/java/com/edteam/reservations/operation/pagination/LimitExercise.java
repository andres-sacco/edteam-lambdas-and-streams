package com.edteam.reservations.operation.pagination;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class LimitExercise {

    public static void main(String[] args) {
        showReservationsLimited();
    }

    // A partir de una lista de ReservationDTO, quedarse solo con las primeras 5.
    public static void showReservationsLimited() {
        List<ReservationDTO> fakeReservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> sortedReservations = getReservationsLimited(fakeReservations);

        System.out.println("Las primeras 5 reservas son:");
        sortedReservations.forEach(System.out::println);
    }

    public static List<ReservationDTO> getReservationsLimited(List<ReservationDTO> reservations) {
        return reservations.stream()
                .limit(5)
                .collect(Collectors.toList());
    }
}
