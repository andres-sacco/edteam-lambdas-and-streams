package com.edteam.reservations.operation.terminal.reduce;

import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.math.BigDecimal;
import java.util.List;

public class ReduceExercise {

    public static void main(String []args) {
        showTotalPrice();
    }

    //  Usar `reduce` para obtener el total de `totalPrice` de todas las reservas en la lista.
    private static void showTotalPrice() {
        List<ReservationDTO> reservations = DataFakerUtil.generateFakeReservations();
        BigDecimal totalPrices= getTotalPriceReservations(reservations);

        System.out.println("Total de precios: " + totalPrices);
    }

    private static BigDecimal getTotalPriceReservations(List<ReservationDTO> reservations) {
        return reservations.stream()
                .map(reservation -> reservation.getItinerary().getPrice().getTotalPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
