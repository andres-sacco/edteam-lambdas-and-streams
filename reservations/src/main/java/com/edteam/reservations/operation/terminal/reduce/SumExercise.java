package com.edteam.reservations.operation.terminal.reduce;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumExercise {

    public static void main(String []args) {
        showTotalTaxes();
    }

    // Usar sum para obtener el total de totalTax en todas las reservas.
    private static void showTotalTaxes() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        double totalTaxes = getTotalTaxes(reservations);

        System.out.println("El total de totalTax es: " + totalTaxes);
    }

    private static double getTotalTaxes(List<ReservationDTO> reservations) {
        return reservations.stream()
                .mapToDouble(reservation -> reservation.getItinerary().getPrice().getTotalTax().doubleValue())
                .sum();
    }
}
