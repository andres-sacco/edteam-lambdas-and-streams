package com.edteam.reservations.operation.order;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOrderExercise {
    public static void main(String [] args) {
        showPassengersSorted();
    }

    // Dada una lista de PassengerDTO, ordénalos alfabéticamente por lastName y, si hay apellidos repetidos, usa firstName como segundo criterio.
    private static void showPassengersSorted() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(15);
        fakePassengers.add(fakePassengers.get(1));
        List<PassengerDTO> sortedPassengers = getPassengersSorted(fakePassengers);

        System.out.println("Pasajeros ordenados por lastName y firstName:");
        sortedPassengers.forEach(System.out::println);
    }

    private static List<PassengerDTO> getPassengersSorted(List<PassengerDTO> passengers) {
        return passengers.stream()
                .sorted(Comparator.comparing(PassengerDTO::getLastName)
                        .thenComparing(PassengerDTO::getFirstName))
                .collect(Collectors.toList());
    }
}
