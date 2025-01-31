# Ejercicios: Modulo 2 - Clase 2

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **map**
- **Obtener los nombres completos de los pasajeros:** A partir de una lista de `PassengerDTO`, generar una lista con el nombre completo de cada pasajero en formato `"Nombre Apellido"`.
- **Calcular el precio total con impuestos:** Dada una lista de `PriceDTO`, obtener una lista con el precio total (`basePrice + totalTax`) de cada objeto.
- **Convertir los IDs de las reservas en cadenas de texto:** A partir de una lista de `ReservationDTO`, generar una lista con los IDs en formato `String`.
- **Obtener la fecha de creación de cada reserva:** A partir de una lista de `ReservationDTO`, generar una lista con las fechas de creación.
- **Extraer los tipos de documento de los pasajeros:** De una lista de `PassengerDTO`, generar una lista con los tipos de documento (`documentType`).
- **Obtener la cantidad de pasajeros en cada reserva:** A partir de una lista de `ReservationDTO`, generar una lista con la cantidad de pasajeros en cada reserva.

### **flatMap**
- **Obtener todos los segmentos de una lista de itinerarios:** A partir de una lista de `ItineraryDTO`, generar una única lista con todos los `SegmentDTO` contenidos en cada itinerario.
- **Extraer los correos electrónicos de los pasajeros de varias reservas:** Dada una lista de `ReservationDTO`, generar una lista con todos los correos electrónicos de los pasajeros.
- **Obtener todas las reservas de una lista de pasajeros:** Dado un `Map<PassengerDTO, List<ReservationDTO>>`, generar una única lista con todas las reservas asociadas a los pasajeros.
- **Listar todos los números de documento de los pasajeros de varias reservas:** A partir de una lista de `ReservationDTO`, generar una lista con todos los `documentNumber` de los pasajeros.
- **Obtener todas las fechas de creación de reservas en una lista única:** A partir de una lista de listas de `ReservationDTO`, generar una lista con todas las fechas de creación de cada reserva.
- **Obtener todos los precios base de una lista de itinerarios:** A partir de una lista de `ItineraryDTO`, generar una única lista con todos los `basePrice` de cada itinerario.


### **flatMapToInt**
- **Obtener todas las edades de los pasajeros como una lista de enteros:** A partir de una lista de `PassengerDTO`, calcular la edad de cada pasajero y generar un `IntStream` con dichas edades.
- **Extraer los dígitos de los números de documento de los pasajeros:** Convertir una lista de `PassengerDTO` en un `IntStream` con todos los dígitos individuales de sus `documentNumber`.
- **Obtener la longitud de cada nombre de pasajero como un `IntStream`:** A partir de una lista de `PassengerDTO`, generar un `IntStream` con la cantidad de caracteres de cada `firstName`.
- **Contar la cantidad de segmentos de cada itinerario:** A partir de una lista de `ItineraryDTO`, generar un `IntStream` con el número de segmentos de cada itinerario.
- **Calcular la suma de todos los impuestos de una lista de precios:** A partir de una lista de `PriceDTO`, generar un `IntStream` con los valores de `totalTax` convertidos a enteros y sumarlos.
- **Contar la cantidad de pasajeros en una lista de reservas:** A partir de una lista de `ReservationDTO`, generar un `IntStream` con la cantidad de pasajeros en cada reserva.

### ***Combinando operadores***

- **Obtener los nombres de pasajeros mayores de edad**: Filtrar los pasajeros (`PassengerDTO`) que tengan 18 años o más y luego obtener solo sus nombres (`firstName`).
- **Listar los precios totales de itinerarios con más de 2 segmentos**: De una lista de `ItineraryDTO`, filtrar aquellos que tengan más de 2 segmentos y luego obtener sus precios totales (`totalPrice`).
- **Obtener los correos electrónicos de pasajeros con documento tipo "PASAPORTE"**: Filtrar los pasajeros cuyo `documentType` sea "PASAPORTE" y luego mapear sus correos electrónicos (`email`).

