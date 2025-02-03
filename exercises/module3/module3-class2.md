# Ejercicios: Modulo 3 - Clase 2

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

## **reduce**
- **Sumar los precios de todas las reservas**: Usar `reduce` para obtener el total de `totalPrice` de todas las reservas en la lista.
- **Concatenar los nombres de todos los pasajeros**: Usar `reduce` para unir los `firstName` de cada `PassengerDTO` en una sola cadena de texto.
- **Obtener el documento de mayor valor numérico**: Usar `reduce` para encontrar el `documentNumber` numéricamente más alto de los pasajeros.
- **Calcular el total de impuestos**: Usar `reduce` para sumar los valores de `totalTax` en una lista de precios.
- **Determinar la reserva con la fecha de creación más antigua**: Usar `reduce` para encontrar la `ReservationDTO` con el `creationDate` más antiguo.
- **Encontrar el pasajero con el nombre más largo**: Usar `reduce` para obtener el `PassengerDTO` cuyo `firstName` tenga más caracteres.

## **max**
- **Encontrar la reserva más reciente**: Usar `max` para obtener el `ReservationDTO` con la fecha de creación más reciente.
- **Obtener el pasajero más viejo**: Usar `max` para encontrar el `PassengerDTO` con la fecha de nacimiento más antigua.
- **Determinar el precio total más alto**: Usar `max` para encontrar el `PriceDTO` con el `totalPrice` más alto.
- **Encontrar el documento con la mayor cantidad de caracteres**: Usar `max` para obtener el `documentNumber` más largo entre los pasajeros.
- **Obtener el itinerario con el mayor número de segmentos**: Usar `max` para encontrar el `ItineraryDTO` con más elementos en su lista de `SegmentDTO`.
- **Determinar el pasajero con el apellido más largo**: Usar `max` para encontrar el `PassengerDTO` con el `lastName` más extenso.

## **min**
- **Encontrar la reserva más antigua**: Usar `min` para obtener la `ReservationDTO` con la fecha de creación más antigua.
- **Obtener el pasajero más joven**: Usar `min` para encontrar el `PassengerDTO` con la fecha de nacimiento más reciente.
- **Determinar el precio total más bajo**: Usar `min` para encontrar el `PriceDTO` con el `totalPrice` más bajo.
- **Encontrar el documento más corto**: Usar `min` para obtener el `documentNumber` más corto de los pasajeros.
- **Obtener el itinerario con la menor cantidad de segmentos**: Usar `min` para encontrar el `ItineraryDTO` con menos elementos en su lista de `SegmentDTO`.
- **Determinar el pasajero con el primer apellido en orden alfabético**: Usar `min` para encontrar el `PassengerDTO` con el `lastName` que aparece primero alfabéticamente.

## **sum**
- **Calcular el total de precios de todas las reservas**: Usar `sum` para sumar los valores de `totalPrice` en `PriceDTO`.
- **Sumar la cantidad total de impuestos**: Usar `sum` para obtener el total de `totalTax` en todas las reservas.
- **Calcular el total de segmentos de todos los itinerarios**: Usar `sum` para contar el total de `SegmentDTO` en una lista de `ItineraryDTO`.
- **Sumar todas las edades de los pasajeros**: Usar `sum` para calcular la suma de las edades de todos los `PassengerDTO`.
- **Sumar la longitud de todos los nombres de pasajeros**: Usar `sum` para calcular la suma de los caracteres de los `firstName` de todos los pasajeros.
- **Calcular el total de caracteres de los números de documento**: Usar `sum` para sumar la cantidad de caracteres en los `documentNumber` de los pasajeros.

## **count**
- **Contar cuántas reservas hay en la lista**: Usar `count` para obtener la cantidad total de `ReservationDTO`.
- **Determinar cuántos pasajeros tienen 18 años o más**: Usar `count` para contar los `PassengerDTO` cuya edad sea 18 o más.
- **Contar cuántos itinerarios tienen al menos un segmento**: Usar `count` para contar los `ItineraryDTO` cuya lista de `SegmentDTO` no esté vacía.
- **Determinar cuántos pasajeros tienen un email válido**: Usar `count` para contar los `PassengerDTO` cuyo `email` no sea nulo ni vacío.
- **Contar cuántas reservas tienen más de 3 pasajeros**: Usar `count` para contar las `ReservationDTO` que tengan más de 3 pasajeros en su lista.
- **Contar cuántos precios totales son mayores a 1000**: Usar `count` para contar cuántos `PriceDTO` tienen un `totalPrice` mayor a 1000.

## **average**
- **Calcular el precio promedio de las reservas**: Usar `average` para obtener el promedio de `totalPrice` en `PriceDTO`.
- **Obtener la edad promedio de los pasajeros**: Usar `average` para calcular la media de edades de los `PassengerDTO`.
- **Determinar el número promedio de segmentos por itinerario**: Usar `average` para calcular el número medio de `SegmentDTO` por `ItineraryDTO`.
- **Calcular la longitud promedio de los nombres de los pasajeros**: Usar `average` para determinar el promedio de caracteres en los `firstName` de los pasajeros.
- **Obtener el promedio de impuestos aplicados**: Usar `average` para calcular la media de `totalTax` en `PriceDTO`.
- **Calcular la longitud promedio de los números de documento**: Usar `average` para obtener el promedio de caracteres en los `documentNumber` de los pasajeros.
