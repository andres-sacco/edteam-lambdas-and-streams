package com.edteam.reservations.collection;

import com.edteam.reservations.model.PassengerDTO;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperationExercise {

    public static void main(String [] args) {
        // Generales
        showPairWithoutStreams();
        showPairWithStreams();

        System.out.println("------------------------------------");

        // Especificos
        showAdultsWithoutStreams();
        showAdultsWithStreams();
    }

    // Dada una lista de números enteros, filtra y muestra solo los números pares.
    public static void showPairWithoutStreams() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> pares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        System.out.println("Números pares (sin Streams): " + pares);
    }

    public static void showPairWithStreams() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares (con Streams): " + pares);
    }

    // Dado un List<PassengerDTO>, obtener una nueva lista con solo los pasajeros de 18 años o más.
    public static void showAdultsWithoutStreams() {
        PassengerDTO passenger1 = new PassengerDTO();
        passenger1.setFirstName("Andres");
        passenger1.setBirthday(LocalDate.of(2017, 1, 1));

        PassengerDTO passenger2 = new PassengerDTO();
        passenger2.setFirstName("Ignacio");
        passenger2.setBirthday(LocalDate.of(2005, 3, 1));

        List<PassengerDTO> pasajeros = List.of(passenger1, passenger2);

        List<PassengerDTO> adultos = new ArrayList<>();
        for (PassengerDTO pasajero : pasajeros) {
            if (Period.between(pasajero.getBirthday(), LocalDate.now()).getYears() >= 18) {
                adultos.add(pasajero);
            }
        }

        System.out.println("Pasajeros adultos (sin Streams): " + adultos);
    }

    public static void showAdultsWithStreams() {
        PassengerDTO passenger1 = new PassengerDTO();
        passenger1.setFirstName("Andres");
        passenger1.setBirthday(LocalDate.of(2017, 1, 1));

        PassengerDTO passenger2 = new PassengerDTO();
        passenger2.setFirstName("Ignacio");
        passenger2.setBirthday(LocalDate.of(2005, 3, 1));

        List<PassengerDTO> pasajeros = List.of(passenger1, passenger2);

        List<PassengerDTO> adultos = pasajeros.stream()
                .filter(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18)
                .collect(Collectors.toList());

        System.out.println("Pasajeros adultos (con Streams): " + adultos);
    }
}
