package com.edteam.reservations.operation.terminal.collect;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExercise {

    public static void main(String[] args) {
        showPassengersNames();
    }

    // Unir todos los documentNumber separados por un guion (,).
    private static void showPassengersNames() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        String document = getPassengersName(fakePassengers);

        System.out.println("Los documentos de los pasajeros son: ");
        System.out.println(document);
    }

    private static String getPassengersName(List<PassengerDTO> passengers) {
        return passengers.stream()
                .map(PassengerDTO::getDocumentNumber)
                .collect(Collectors.joining(","));
    }
}
