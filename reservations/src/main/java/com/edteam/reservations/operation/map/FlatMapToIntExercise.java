package com.edteam.reservations.operation.map;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapToIntExercise {

    public static void main(String[] args) {
        showPassengersAge();
    }

    // Obtener todas las edades de los pasajeros como una lista de enteros
    private static void showPassengersAge() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        List<Integer> fullNames = getPassengersAge(fakePassengers);

        System.out.println("Las edades de los pasajeros son: ");
        fullNames.forEach(System.out::println);
    }

    private static List<Integer> getPassengersAge(List<PassengerDTO> passengers) {
        return passengers.stream()
                .flatMapToInt(p -> {
                    int age = Period.between(p.getBirthday(), LocalDate.now()).getYears();  // Calcular la edad
                    return java.util.stream.IntStream.of(age);
                })
                .boxed()  // Convertir a List<Integer> para una representación más manejable
                .collect(Collectors.toList());
    }
}
