package com.edteam.reservations.operation.terminal.collect;


import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class ToListExercise {

    public static void main(String[] args) {
        showPassengersEmails();
    }

    // Obtener los emails de todos los pasajeros
    private static void showPassengersEmails() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        List<String> fullNames = getPassengersEmails(fakePassengers);

        System.out.println("Los emails de los pasajeros son: ");
        fullNames.forEach(System.out::println);
    }

    private static List<String> getPassengersEmails(List<PassengerDTO> passengers) {
        return passengers.stream()
                .map(PassengerDTO::getEmail)
                .collect(Collectors.toList());
    }
}