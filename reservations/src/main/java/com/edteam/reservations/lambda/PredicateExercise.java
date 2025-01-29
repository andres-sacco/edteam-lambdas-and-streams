package com.edteam.reservations.lambda;

import com.edteam.reservations.model.PassengerDTO;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExercise {

    public static void main(String [] args) {
        // Generales
        checkList();

        // Especificos
        isAdult();
    }

    // Crea un Predicate que verifique si una lista de elementos está vacía.
    public static void checkList() {
        List<String> list = new ArrayList<>();

        Predicate<List<?>> isEmpty = listToCheck -> listToCheck.isEmpty();
        boolean result = isEmpty.test(list);
        System.out.println("¿La lista está vacía? " + result);

        list.add("Elemento");
        result = isEmpty.test(list);
        System.out.println("¿La lista está vacía? " + result);
    }

    // Define un Predicate<PassengerDTO> que determine si un pasajero tiene 18 años o más.
    public static void isAdult() {
        PassengerDTO passenger = new PassengerDTO();
        passenger.setFirstName("Andres");
        passenger.setBirthday(LocalDate.of(2000,1,1));

        Predicate<PassengerDTO> isAdult = p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18;

        boolean result = isAdult.test(passenger);
        System.out.println("¿" + passenger.getFirstName() + " es adulto? " + result);
    }
}
