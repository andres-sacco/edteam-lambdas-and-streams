package com.edteam.reservations.lambda;

import com.edteam.reservations.model.ReservationDTO;

import java.time.LocalDate;
import java.util.function.BinaryOperator;

public class BinaryOperatorExercise {

    public static void main(String [] args) {
        // Generales
        checkMax();

        // Especificos
        changeCreationDate();
    }

    // Crea un BinaryOperator que devuelva el máximo de dos números enteros.
    public static void checkMax() {
        BinaryOperator<Integer> maxOperator = (num1, num2) -> num1 > num2 ? num1 : num2;

        int result = maxOperator.apply(10, 25);
        System.out.println("El máximo de 10 y 25 es: " + result);
    }

    // Define un BinaryOperator<ReservationDTO> que tome dos reservas y establezca en la primera la fecha de creación más reciente de ambas.
    public static void changeCreationDate() {
        ReservationDTO reservation1 = new ReservationDTO();
        reservation1.setCreationDate(LocalDate.of(2023, 1, 1));

        ReservationDTO reservation2 = new ReservationDTO();
        reservation2.setCreationDate(LocalDate.of(2023, 5, 15));

        // Imprimir las fechas originales
        System.out.println("Fecha de creación de reserva 1: " + reservation1.getCreationDate());
        System.out.println("Fecha de creación de reserva 2: " + reservation2.getCreationDate());

        BinaryOperator<ReservationDTO> setMostRecentDate = (res1, res2) -> {
            // Establecer en la primera reserva la fecha más reciente entre ambas
            if (res1.getCreationDate().isBefore(res2.getCreationDate())) {
                res1.setCreationDate(res2.getCreationDate());
            }
            return res1;
        };

        reservation1 = setMostRecentDate.apply(reservation1, reservation2);

        // Imprimir la nueva fecha de la primera reserva
        System.out.println("Nueva fecha de creación de reserva 1: " + reservation1.getCreationDate());
    }
}
