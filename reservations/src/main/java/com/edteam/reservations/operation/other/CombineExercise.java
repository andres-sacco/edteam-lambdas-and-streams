package com.edteam.reservations.operation.other;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
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
        showReservationWithNotNullCreationDate();
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

    // ordenando por fecha de creación en orden descendente después de filtrar las reservas con una fecha de creación no nula y limitando el resultado a tres.
    public static void showReservationWithNotNullCreationDate() {
        List<ReservationDTO> fakeReservations = DataFakerUtil.generateFakeReservations();
        List<ReservationDTO> sortedReservations = getReservationWithNotNullCreationDate(fakeReservations);

        System.out.println("Reservas son:");
        sortedReservations.forEach(System.out::println);
    }

    private static List<ReservationDTO> getReservationWithNotNullCreationDate(List<ReservationDTO> reservations) {
        return  reservations.stream()
                .filter(reserva -> reserva.getCreationDate() != null)
                .sorted(Comparator.comparing(ReservationDTO::getCreationDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
