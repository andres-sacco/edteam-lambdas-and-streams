package com.edteam.reservations.lambda;

import com.edteam.reservations.model.ItineraryDTO;
import com.edteam.reservations.model.ReservationDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.function.Supplier;


public class SupplierExercise {

    public static void main(String [] args) {
        // Generales
        getActualDate();

        // Especificos
        createReservation();
    }

    // Crea un Supplier que devuelva la fecha y hora actual en formato String.
    public static void getActualDate() {
        Supplier<String> dateTimeSupplier = () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return LocalDateTime.now().format(formatter);
        };
        System.out.println("Fecha y hora actual: " + dateTimeSupplier.get());
    }

    // Crea un Supplier<ReservationDTO> que devuelva una nueva instancia de ReservationDTO con valores predeterminados.
    public static void createReservation() {
        Supplier<ReservationDTO> reservationSupplier = () -> {
            ReservationDTO reservation = new ReservationDTO();
            reservation.setId(1L);
            reservation.setPassengers(Collections.emptyList());
            reservation.setItinerary(new ItineraryDTO());
            reservation.setCreationDate(LocalDate.now());
            return reservation;
        };

        ReservationDTO newReservation = reservationSupplier.get();
        System.out.println("Reserva creada: " + newReservation);
    }
}
