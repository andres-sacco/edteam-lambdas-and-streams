package com.edteam.reservations.operation.terminal.search;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

public class FindAnyExercise {

    public static void main(String[] args) {
        showFirstAnyPassenger();
    }

    // Usar `findAny` para recuperar un PassengerDTO cuyo cálculo de edad (basado en birthday) sea mayor a 30.
    public static void showFirstAnyPassenger() {
        List<PassengerDTO> passengers = DataFakerUtil.generateFakePassengers(5);

        Optional<PassengerDTO> passengerOver30 = getAdultPassenger(passengers);

        passengerOver30.ifPresent(passenger ->
                System.out.println("Pasajero encontrado: " + passenger.getFirstName())
        );
    }

    private static Optional<PassengerDTO> getAdultPassenger(List<PassengerDTO> passengers) {
        return passengers.stream()
                .filter(passenger -> calculateAge(passenger.getBirthday()) > 30)
                .findAny();
    }

    private static int calculateAge(LocalDate birthday) {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
