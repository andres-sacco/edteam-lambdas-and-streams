package com.edteam.reservations.operation.intermediate.unique;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExercise {

    public static void main(String []args) {
        showUniquePassengers();
    }

    // Dada una lista de `PassengerDTO`, eliminar los duplicados considerando solo el `documentNumber`.
    private static void showUniquePassengers() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        fakePassengers.add(fakePassengers.get(1));
        List<PassengerDTO> result = getUniquePassengers(fakePassengers);

        System.out.println("Los pasajeros son: ");
        result.forEach(System.out::println);
    }

    private static List<PassengerDTO> getUniquePassengers(List<PassengerDTO> passengers) {
        return passengers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<PassengerDTO> getUniquePassengersAlternative(List<PassengerDTO> passengers) {
        return passengers.stream()
                .collect(Collectors.toMap(
                        PassengerDTO::getDocumentNumber,
                        passenger -> passenger,
                        (existing, replacement) -> existing))
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}
