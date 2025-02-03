package com.edteam.reservations.operation.terminal.reduce;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.OptionalDouble;

public class AverageExercise {

    public static void main(String []args) {
        showTotalPassengers();
    }

    // Usar `average` para calcular la media de edades de los `PassengerDTO` cuya edad sea 18 o más.
    private static void showTotalPassengers() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        OptionalDouble averageAge = getTotalPassengers(fakePassengers);

        System.out.println("La edad promedio de los pasajeros es: " + averageAge.getAsDouble());
    }

    private static OptionalDouble getTotalPassengers(List<PassengerDTO> passengers) {
        return passengers.stream()
                .filter(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18)
                .mapToInt(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears())
                .average();
    }
}
