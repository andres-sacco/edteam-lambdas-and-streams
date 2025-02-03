package com.edteam.reservations.operation.terminal.collect;


import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Arrays;
import java.util.List;

public class ToArrayExercise {

    public static void main(String[] args) {
        showPassengersNames();
    }

    // Extraer los firstName de cada PassengerDTO y almacenarlos en un arreglo de String[].
    private static void showPassengersNames() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        String[] names = getPassengersName(fakePassengers);

        System.out.println("Los nombres de los pasajeros son: ");
        System.out.println(Arrays.toString(names));
    }

    private static String[] getPassengersName(List<PassengerDTO> passengers) {
        return passengers.stream()
                .map(PassengerDTO::getFirstName)
                .toArray(String[]::new);
    }
}