# Ejercicios: Modulo 2 - Clase 3

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase


### **Ordenamiento Simple**
- **Ordenar reservas por fecha de creación**: Ordena una lista de `ReservationDTO` por su `creationDate` en orden ascendente.
- **Ordenar pasajeros por apellido**: Dada una lista de `PassengerDTO`, ordénalos alfabéticamente por `lastName`.
- **Ordenar itinerarios por precio total**: Dada una lista de `ItineraryDTO`, ordénalos por el `totalPrice` del objeto `PriceDTO`, de menor a mayor.
- **Ordenar pasajeros por edad descendente**: Dada una lista de `PassengerDTO`, ordénalos de mayor a menor según su edad calculada desde `birthday`.
- **Ordenar segmentos de un itinerario por nombre**: Dado un `ItineraryDTO` con una lista de `SegmentDTO`, ordena los segmentos por su nombre en orden alfabético.
- **Ordenar reservas primero por fecha de creación y luego por cantidad de pasajeros**: Ordena una lista de `ReservationDTO` primero por `creationDate` y, en caso de empate, por la cantidad de `passengers` en orden descendente.
- **Ordenar precios por impuestos en orden descendente**: Dada una lista de `PriceDTO`, ordénalos de mayor a menor según `totalTax`.

### **Ordenamiento Multiple**
- **Ordenar reservas por fecha de creación y cantidad de pasajeros**: Ordena una lista de `ReservationDTO` primero por `creationDate` (ascendente) y, en caso de empate, por la cantidad de `passengers` (descendente).
- **Ordenar pasajeros por apellido y luego por nombre**: Dada una lista de `PassengerDTO`, ordénalos alfabéticamente por `lastName` y, si hay apellidos repetidos, usa `firstName` como segundo criterio.
- **Ordenar itinerarios por precio total y, en caso de empate, por cantidad de segmentos**: Ordena una lista de `ItineraryDTO` primero por `totalPrice` (ascendente) y, si hay precios iguales, por la cantidad de `SegmentDTO` en cada itinerario (descendente).
- **Ordenar reservas primero por cantidad de pasajeros, luego por fecha de creación y finalmente por ID**: Ordena `ReservationDTO` primero por la cantidad de `passengers` (descendente), luego por `creationDate` (ascendente) y, si hay empate, por `id` (ascendente).
- **Ordenar pasajeros por edad y luego por documento**: Dada una lista de `PassengerDTO`, ordénalos primero por edad (de mayor a menor) y, si hay empate, por `documentNumber` en orden ascendente.
- **Ordenar precios por base price, luego por total tax y finalmente por total price**: Dada una lista de `PriceDTO`, ordénalos primero por `basePrice` (ascendente), luego por `totalTax` (descendente) y finalmente por `totalPrice` (ascendente).

### ***Combinando operadores***

- **Ordenar pasajeros mayores de edad por fecha de nacimiento**: Filtrar los pasajeros (`PassengerDTO`) que tengan 18 años o más y luego ordenarlos por `birthday` de más reciente a más antiguo.
- **Ordenar reservas recientes con más de un pasajero**: Filtrar las `ReservationDTO` que tengan más de un pasajero y luego ordenarlas por `creationDate` en orden descendente.
- **Ordenar itinerarios con precio total mayor a 500**: Filtrar los `ItineraryDTO` cuyo `totalPrice` sea mayor a 500 y luego ordenarlos por `totalPrice` en orden ascendente.

