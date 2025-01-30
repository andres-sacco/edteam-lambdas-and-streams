package com.edteam.reservations.operation.filter;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileExercise {

    public static void main(String [] args) {
        showYoungPassengers();
    }

    // Tomar pasajeros mientras sean menores de 30 años.
    public static void showYoungPassengers() {
        ReservationDTO fakeReservation = DataFakerUtil.generateFakeReservation();
        List<PassengerDTO> youngPassengers = getYoungPassengers(fakeReservation);

        if(!youngPassengers.isEmpty()) {
            System.out.println("Pasajeros menores de 30 años:");
            youngPassengers.forEach(System.out::println);
        } else {
            System.out.println("No hay pasajeros menores de 30 años");
        }
    }

    public static List<PassengerDTO> getYoungPassengers(ReservationDTO reservation) {
        return reservation.getPassengers().stream()
                .takeWhile(passenger -> passenger.getBirthday().plusYears(30).isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }
}
