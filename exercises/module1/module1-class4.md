# Ejercicios: Modulo 1 - Clase 4

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase


## Generales
En esta seccion encontraras ejercicios genericos sin ningun tipo de relacion con el modelo de dominio del curso.

### Operaciones
- **Filtrar números pares**: Dada una lista de números enteros, filtra y muestra solo los números pares.
- **Filtrar cadenas que empiezan con una letra específica**: Dada una lista de cadenas, filtra y muestra solo las cadenas que empiezan con la letra `"A"`.
- **Filtrar números mayores que un valor**: Dada una lista de números enteros, filtra y muestra solo los números mayores que `10`.
- **Filtrar cadenas con longitud específica**: Dada una lista de cadenas, filtra y muestra solo las cadenas que tienen una longitud mayor que `5` caracteres.
- **Filtrar números primos**: Dada una lista de números enteros, filtra y muestra solo los números primos.
- **Filtrar elementos no nulos**: Dada una lista de objetos (que puede contener `null`), filtra y muestra solo los elementos que no son nulos.
- **Filtrar números dentro de un rango**: Dada una lista de números enteros, filtra y muestra solo los números que están dentro del rango `[20, 50]`.


### Factory Methods
- **Crear un mapa con más de 10 elementos**: Usa el factory method Map.ofEntries() para crear un mapa inmutable con más de 10 elementos. Por ejemplo, crea un mapa con los números del 1 al 15 como claves y sus cuadrados como valores.
- **Crear una lista inmutable**: Usa el factory method List.of() para crear una lista inmutable con los elementos "Java", "Python", "C++" y "JavaScript".
- **Crear un conjunto inmutable**: Usa el factory method Set.of() para crear un conjunto inmutable con los números 1, 2, 3, 4 y 5.
- **Crear una lista vacía**: Usa el factory method List.of() para crear una lista vacía. Luego, intenta agregar un elemento a la lista.
- **Crear un mapa inmutable con valores nulos**: Intenta crear un mapa inmutable usando Map.of() donde uno de los valores sea null.
- **Crear un mapa inmutable con un solo par clave-valor**: Usa el factory method Map.of() para crear un mapa inmutable con un solo par clave-valor, por ejemplo, "Uno" -> 1.
- **Crear una lista inmutable con un solo elemento**: Usa el factory method List.of() para crear una lista inmutable con un solo elemento, por ejemplo, "Hola".

## Especificas
En esta seccion encontraras ejercicios conectados con el modelo de dominio del curso acerca de las reservas.

### Operaciones
- **Filtrar pasajeros mayores de edad**: Dado un `List<PassengerDTO>`, obtener una nueva lista con solo los pasajeros de 18 años o más.
- **Ordenar reservas por fecha de creación**: Dado un `List<ReservationDTO>`, ordenarlo de la más reciente a la más antigua.
- **Filtrar itinerarios con más de una parada**: Dado un `List<ItineraryDTO>`, obtener solo los itinerarios que tengan más de una parada.
- **Ordenar pasajeros por apellido**: Dado un `List<PassengerDTO>`, ordenarlo alfabéticamente por el apellido del pasajero.
- **Filtrar reservas con más de 3 pasajeros**: Dado un `List<ReservationDTO>`, obtener solo aquellas reservas donde haya más de tres pasajeros.
- **Ordenar itinerarios por duración**: Dado un `List<ItineraryDTO>`, ordenarlo de menor a mayor duración del viaje.
- **Filtrar pasajeros con correo electrónico válido**: Dado un `List<PassengerDTO>`, obtener solo aquellos cuyo email tenga un formato válido (por ejemplo, contenga `@`).
