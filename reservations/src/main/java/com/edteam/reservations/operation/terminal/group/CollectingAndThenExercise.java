package com.edteam.reservations.operation.terminal.group;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingAndThenExercise {

    public static void main(String[] args) {
        showReservations();
    }

    // Usar `collectingAndThen` para contar ReservationDTO y luego transformar el número a una cadena formateada.
    public static void showReservations() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        String result = getReservations(reservations);
        System.out.println(result);
    }

    private static String getReservations(List<ReservationDTO> reservations) {
        return reservations.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.counting(),  // Contar los elementos
                        count -> "Total de reservas: " + count  // Transformar el número a una cadena formateada
                ));
    }
}
