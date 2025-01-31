package com.edteam.reservations.operation.intermediate.filter;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileExercise {

    public static void main(String[] args) {
        showOldPassengers();
    }

    // Descartar los primeros pasajeros hasta encontrar uno mayor de 40 años.
    private static void showOldPassengers() {
        ReservationDTO fakeReservation = DataFakerUtil.generateFakeReservation();
        List<PassengerDTO> olderPassengers = getOlderPassengers(fakeReservation);

        if(!olderPassengers.isEmpty()) {
            System.out.println("Pasajeros de 40 años o más:");
            olderPassengers.forEach(System.out::println);
        } else {
            System.out.println("No hay pasajeros de 40 años o mas");
        }
    }

    public static List<PassengerDTO> getOlderPassengers(ReservationDTO reservation) {
        return reservation.getPassengers().stream()
                .dropWhile(passenger -> passenger.getBirthday().plusYears(40).isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }
}