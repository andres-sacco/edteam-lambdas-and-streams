package com.edteam.reservations.lambda;

import com.edteam.reservations.model.PassengerDTO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExercise {
    public static void main(String [] args) {
        // Generales
        printNumbers();

        // Especificos
        sendNotification();
    }

    // Crea un Consumer que tome una lista de elementos y la imprima en la consola.
    public static void printNumbers() {
        Consumer<List<String>> printList = list -> list.forEach(System.out::println);
        List<String> items = Arrays.asList("Elemento 1", "Elemento 2", "Elemento 3");
        printList.accept(items);
    }

    // Define un Consumer<PassengerDTO> que tome un pasajero y simule el envío de una notificación a su correo electrónico.
    public static void sendNotification() {
        Consumer<PassengerDTO> sendNotification = passenger -> {
            if (passenger.getEmail() != null && !passenger.getEmail().isEmpty()) {
                System.out.println("Enviando notificación a: " + passenger.getEmail());
            } else {
                System.out.println("No se puede enviar notificación: el pasajero no tiene email.");
            }
        };

        PassengerDTO passenger = new PassengerDTO();
        passenger.setEmail("ejemplo@email.com");
        sendNotification.accept(passenger);
    }
}
