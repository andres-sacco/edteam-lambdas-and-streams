package com.edteam.reservations.operation.terminal.reduce;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.model.ReservationDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class CountExercise {

    public static void main(String []args) {
        showTotalPassengers();
    }

    // Usar count para contar los PassengerDTO cuya edad sea 18 o más.
    private static void showTotalPassengers() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);
        long countAdults = getTotalPassengers(fakePassengers);

        System.out.println("La cantidad de pasajeros con 18 o más años es: " + countAdults);
    }

    private static long getTotalPassengers(List<PassengerDTO> passengers) {
        return passengers.stream()
                .filter(p -> Period.between(p.getBirthday(), LocalDate.now()).getYears() >= 18)
                .count();
    }
}
