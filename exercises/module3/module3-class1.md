# Ejercicios: Modulo 3 - Clase 1

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase


### **toList**
- **Obtener una lista de nombres de pasajeros**: Extraer el `firstName` de cada `PassengerDTO` y almacenarlo en una nueva lista.
- **Listar las reservas con más de 3 pasajeros**: Filtrar una lista de `ReservationDTO` para obtener solo las reservas que tengan más de 3 pasajeros y recolectarlas en una nueva lista.
- **Obtener una lista de itinerarios de reservas activas**: A partir de una lista de `ReservationDTO`, obtener una nueva lista con los `ItineraryDTO` de reservas cuyo `creationDate` no sea nulo.
- **Generar una lista de correos electrónicos de pasajeros**: Extraer el `email` de cada `PassengerDTO` en una lista de correos electrónicos únicos.
- **Obtener las reservas más recientes**: Ordenar las reservas por `creationDate` en orden descendente y recolectar solo las primeras 5 en una lista.
- **Filtrar pasajeros adultos y recolectarlos en una lista**: Obtener una lista de `PassengerDTO` con aquellos pasajeros cuya edad sea 18 años o más.

### **toArray**
- **Convertir una lista de nombres de pasajeros en un arreglo**: Extraer los `firstName` de cada `PassengerDTO` y almacenarlos en un arreglo de `String[]`.
- **Obtener un arreglo de identificadores de reservas**: Extraer los `id` de cada `ReservationDTO` y almacenarlos en un `Long[]`.
- **Convertir los correos electrónicos de los pasajeros en un array**: Extraer el `email` de cada `PassengerDTO` y guardarlos en un `String[]`.
- **Obtener un arreglo con los precios totales de las reservas**: Extraer el `totalPrice` de cada `PriceDTO` dentro de las reservas y almacenarlos en un `BigDecimal[]`.
- **Convertir los itinerarios en un arreglo**: Extraer los `ItineraryDTO` de cada `ReservationDTO` y almacenarlos en un `ItineraryDTO[]`.
- **Generar un arreglo de números de documento de los pasajeros**: Extraer el `documentNumber` de cada `PassengerDTO` y almacenarlos en un `String[]`.


### **joining**
- **Unir los nombres de los pasajeros en una sola cadena**: Obtener el `firstName` de cada `PassengerDTO` y concatenarlos con una coma como separador.
- **Generar una lista de documentos de pasajeros en un solo String**: Unir todos los `documentNumber` separados por un guion (`-`).
- **Crear una lista de destinos de los itinerarios**: Extraer los destinos de cada `ItineraryDTO` y unirlos con una barra vertical (`|`).
- **Concatenar los nombres completos de los pasajeros con salto de línea**: Obtener el `firstName` y `lastName` de cada `PassengerDTO` y unirlos en un solo `String`, separados por `\n`.
- **Formatear los correos electrónicos en una cadena con prefijo y sufijo**: Unir los `email` de cada `PassengerDTO` en una cadena, agregando `Emails: [` al inicio y `]` al final.
- **Generar una lista de identificadores de reservas como un solo texto**: Extraer el `id` de cada `ReservationDTO` y unirlos en una cadena separada por espacios.

### **teeing**
- **Obtener el número total de reservas y la fecha de la más reciente**: Usar `teeing` para contar las reservas y obtener la fecha de creación más reciente en un `Pair<Integer, LocalDate>`.
- **Calcular el precio total y el impuesto total de todas las reservas**: Usar `teeing` para sumar todos los `totalPrice` y `totalTax` de `PriceDTO`, almacenándolos en un `Pair<BigDecimal, BigDecimal>`.
- **Determinar la edad promedio y la edad máxima de los pasajeros**: Usar `teeing` para calcular la edad promedio y la edad máxima de una lista de `PassengerDTO`.
- **Contar los pasajeros adultos y menores de edad en la lista**: Usar `teeing` para contar cuántos `PassengerDTO` tienen 18 años o más y cuántos son menores.
- **Obtener la cantidad total de reservas y cuántas tienen más de 3 pasajeros**: Contar el total de reservas y, en paralelo, contar cuántas tienen más de 3 pasajeros, almacenándolo en un `Pair<Integer, Integer>`.
- **Determinar el itinerario con mayor precio y el promedio de todos los precios**: Usar `teeing` para encontrar el itinerario más costoso y calcular el precio promedio de todas las reservas.

### **collect**

- **Crear un mapa de pasajeros con su email como clave**: Usar `Collectors.toMap` para almacenar cada `PassengerDTO` usando su `email` como clave y el objeto como valor.
- **Obtener el pasajero más joven y el más viejo**: Usar `Collectors.collectingAndThen` junto con `minBy` y `maxBy` para obtener el pasajero con la menor y la mayor fecha de nacimiento.
- **Crear una lista inmutable de documentos de pasajeros**: Usar `Collectors.toUnmodifiableList()` para recolectar los `documentNumber` de cada `PassengerDTO` en una lista inmutable.  