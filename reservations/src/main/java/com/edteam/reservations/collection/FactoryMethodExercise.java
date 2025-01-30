package com.edteam.reservations.collection;

import java.util.List;

public class FactoryMethodExercise {
    public static void main(String [] args) {
        // Generales
        createList();
    }

    // Usa el factory method List.of() para crear una lista inmutable con los elementos "Java", "Python", "C++" y "JavaScript".
    public static void createList() {
        List<String> lenguajes = List.of("Java", "Python", "C++", "JavaScript");

        System.out.println(lenguajes);
    }
}
