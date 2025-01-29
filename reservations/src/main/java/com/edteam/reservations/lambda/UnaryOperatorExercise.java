package com.edteam.reservations.lambda;

import com.edteam.reservations.model.ReservationDTO;

import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class UnaryOperatorExercise {
    public static void main(String [] args) {
        // Generales
        incrementNumber();

        // Especificos
        incrementCreationDate();
    }

    // Crea un UnaryOperator que tome un número entero y lo incremente en 1.
    public static void incrementNumber() {
        UnaryOperator<Integer> incrementOperator = num -> num + 1;
        int result = incrementOperator.apply(5);
        System.out.println("Resultado incrementado: " + result);
    }

    // Crea un UnaryOperator<ReservationDTO> que aumente la fecha de creación de la reserva en un número específico de días.
    public static void incrementCreationDate() {
        ReservationDTO reservation = new ReservationDTO();
        reservation.setCreationDate(LocalDate.of(2023, 1, 1));

        // Imprimir la fecha original
        System.out.println("Fecha original: " + reservation.getCreationDate());

        UnaryOperator<ReservationDTO> increaseDate = res -> {
            // Aumentar la fecha de creación en 10 días
            res.setCreationDate(res.getCreationDate().plusDays(10));
            return res;
        };
        reservation = increaseDate.apply(reservation);

        // Imprimir la nueva fecha
        System.out.println("Nueva fecha: " + reservation.getCreationDate());
    }

}
