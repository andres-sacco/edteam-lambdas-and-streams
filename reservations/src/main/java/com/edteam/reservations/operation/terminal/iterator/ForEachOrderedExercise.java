package com.edteam.reservations.operation.terminal.iterator;

import com.edteam.reservations.model.PassengerDTO;
import com.edteam.reservations.util.DataFakerUtil;

import java.util.List;

public class ForEachOrderedExercise {

    public static void main(String[] args) {
        showPassengersNames();
    }

    // Usar `forEach` para recorrer una lista de PassengerDTO e imprimir en consola el nombre completo de cada pasajero.
    private static void showPassengersNames() {
        List<PassengerDTO> fakePassengers = DataFakerUtil.generateFakePassengers(5);

        fakePassengers.stream().forEachOrdered(passenger ->
                System.out.println(passenger.getFirstName() + " " + passenger.getLastName())
        );
    }

}
