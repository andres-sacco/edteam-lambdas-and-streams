package com.edteam.reservations.operation.other;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CombineExercise {

    public static void main(String[] args) {
        showPassengersNames();
        showAdultPassengersSorted();
    }

    // Filtrar los pasajeros (PassengerDTO) que tengan 18 años o más y luego obtener solo sus nombres (firstName)
    private static void showPassengersNames() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        List<String> fullNames = getPassengersName(fakePassengers);

        System.out.println("Los nombres de los pasajeros son: ");
        fullNames.forEach(System.out::println);
    }

    private static List<String> getPassengersName(List<PassengerDTO> passengers) {
        return passengers.stream()
                .filter(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18)
                .map(PassengerDTO::getFirstName)
                .collect(Collectors.toList());
    }

    // Filtrar los pasajeros (PassengerDTO) que tengan 18 años o más y luego ordenarlos por birthday de más reciente a más antiguo.
    private static void showAdultPassengersSorted() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        List<PassengerDTO> fullNames = getAdultPassengersSorted(fakePassengers);

        System.out.println("Los pasajeros adultos son: ");
        fullNames.forEach(System.out::println);
    }

    private static List<PassengerDTO> getAdultPassengersSorted(List<PassengerDTO> passengers) {
        return passengers.stream()
                .filter(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18)
                .sorted(Comparator.comparing(PassengerDTO::getBirthday).reversed())
                .collect(Collectors.toList());
    }
}
