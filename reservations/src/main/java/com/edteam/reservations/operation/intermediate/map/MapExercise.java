package com.edteam.reservations.operation.intermediate.map;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.stream.Collectors;

public class MapExercise {

    public static void main(String[] args) {
        showPassengersNames();
    }

    //Obtener los nombres completos de los pasajeros
    private static void showPassengersNames() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        List<String> fullNames = getPassengersName(fakePassengers);

        System.out.println("Los nombres de los pasajeros son: ");
        fullNames.forEach(System.out::println);
    }

    private static List<String> getPassengersName(List<PassengerDTO> passengers) {
        return passengers.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
    }
}
