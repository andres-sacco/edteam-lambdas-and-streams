# Ejercicios: Modulo 2 - Clase 3

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase


### **Simples**
- **Ordenar reservas por fecha de creación**: Ordena una lista de `ReservationDTO` por su `creationDate` en orden ascendente.
- **Ordenar pasajeros por apellido**: Dada una lista de `PassengerDTO`, ordénalos alfabéticamente por `lastName`.
- **Ordenar itinerarios por precio total**: Dada una lista de `ItineraryDTO`, ordénalos por el `totalPrice` del objeto `PriceDTO`, de menor a mayor.
- **Ordenar pasajeros por edad descendente**: Dada una lista de `PassengerDTO`, ordénalos de mayor a menor según su edad calculada desde `birthday`.
- **Ordenar segmentos de un itinerario por nombre**: Dado un `ItineraryDTO` con una lista de `SegmentDTO`, ordena los segmentos por su nombre en orden alfabético.
- **Ordenar reservas primero por fecha de creación y luego por cantidad de pasajeros**: Ordena una lista de `ReservationDTO` primero por `creationDate` y, en caso de empate, por la cantidad de `passengers` en orden descendente.
- **Ordenar precios por impuestos en orden descendente**: Dada una lista de `PriceDTO`, ordénalos de mayor a menor según `totalTax`.


### **Multiples**
- **Ordenar reservas por fecha de creación y cantidad de pasajeros**: Ordena una lista de `ReservationDTO` primero por `creationDate` (ascendente) y, en caso de empate, por la cantidad de `passengers` (descendente).
- **Ordenar pasajeros por apellido y luego por nombre**: Dada una lista de `PassengerDTO`, ordénalos alfabéticamente por `lastName` y, si hay apellidos repetidos, usa `firstName` como segundo criterio.
- **Ordenar itinerarios por precio total y, en caso de empate, por cantidad de segmentos**: Ordena una lista de `ItineraryDTO` primero por `totalPrice` (ascendente) y, si hay precios iguales, por la cantidad de `SegmentDTO` en cada itinerario (descendente).
- **Ordenar reservas primero por cantidad de pasajeros, luego por fecha de creación y finalmente por ID**: Ordena `ReservationDTO` primero por la cantidad de `passengers` (descendente), luego por `creationDate` (ascendente) y, si hay empate, por `id` (ascendente).
- **Ordenar pasajeros por edad y luego por documento**: Dada una lista de `PassengerDTO`, ordénalos primero por edad (de mayor a menor) y, si hay empate, por `documentNumber` en orden ascendente.
- **Ordenar precios por base price, luego por total tax y finalmente por total price**: Dada una lista de `PriceDTO`, ordénalos primero por `basePrice` (ascendente), luego por `totalTax` (descendente) y finalmente por `totalPrice` (ascendente).
