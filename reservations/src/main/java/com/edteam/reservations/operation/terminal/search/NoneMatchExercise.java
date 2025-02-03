package com.edteam.reservations.operation.terminal.search;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;

public class NoneMatchExercise {
    public static void main(String[] args) {
        showPassengerWithEmails();
    }

    // Usar noneMatch en PassengerDTO para confirmar que cada pasajero tiene un email.
    public static void showPassengerWithEmails() {
        List<PassengerDTO> passengers = DataFakerUtil.generateFakePassengers(5);
        boolean noEmptyEmails = getPassengerWithEmails(passengers);
        System.out.println("¿Todos los pasajeros tienen email válido?: " + noEmptyEmails);
    }

    private static boolean getPassengerWithEmails(List<PassengerDTO> passengers) {
        return passengers.stream()
                .noneMatch(passenger -> passenger.getEmail() == null || passenger.getEmail().isBlank());
    }
}
