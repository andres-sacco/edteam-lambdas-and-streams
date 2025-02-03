package com.edteam.reservations.operation.terminal.group;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExercise {

    public static void main(String[] args) {
        showPassengersGroups();
    }

    // Usar `partitioningBy` para dividir una lista de PassengerDTO en dos grupos según si su edad es mayor o igual a 18.
    public static void showPassengersGroups() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);

        Map<Boolean, List<PassengerDTO>> partitionedPassengers = getPassengersGroups(fakePassengers);

        System.out.println("Mayores de edad:");
        partitionedPassengers.get(true).forEach(p -> System.out.println(p.getFirstName()));

        System.out.println("\nMenores de edad:");
        partitionedPassengers.get(false).forEach(p -> System.out.println(p.getFirstName()));
    }

    private static Map<Boolean, List<PassengerDTO>> getPassengersGroups(List<PassengerDTO> passengers) {
        return passengers.stream()
                .collect(Collectors.partitioningBy(passenger -> calculateAge(passenger.getBirthday()) >= 18));
    }

    private static int calculateAge(LocalDate birthday) {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

}
