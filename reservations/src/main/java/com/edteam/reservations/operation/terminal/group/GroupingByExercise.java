package com.edteam.reservations.operation.terminal.group;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExercise {

    public static void main(String[] args) {
        showPassengers();
    }

    // Usar `groupingBy` para agrupar una lista de PassengerDTO según su documentType.
    public static void showPassengers() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(10);

        Map<String, List<PassengerDTO>> partitionedPassengers = getPassengers(fakePassengers);

        partitionedPassengers.forEach((documentType, passengerList) -> {
            System.out.println(documentType + ":");
            passengerList.forEach(p -> System.out.println("  " + p.getFirstName()));
        });
    }

    private static Map<String, List<PassengerDTO>> getPassengers(List<PassengerDTO> passengers) {
        return passengers.stream()
                .collect(Collectors.groupingBy(PassengerDTO::getDocumentType));
    }
}
