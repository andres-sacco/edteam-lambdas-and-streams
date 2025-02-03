# Ejercicios: Modulo 2 - Clase 4

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **skip**
- **Omitir las primeras 3 reservas**: Dada una lista de `ReservationDTO`, obtener una nueva lista omitiendo las primeras 3 reservas.
- **Omitir los primeros 2 pasajeros de cada reserva**: Para cada `ReservationDTO`, eliminar los dos primeros pasajeros de la lista.
- **Omitir los itinerarios con precios más bajos**: En una lista de `ItineraryDTO`, ordenar por `totalPrice` de mayor a menor y omitir los 2 más baratos.
- **Omitir las primeras 5 reservas con más de 2 pasajeros**: De una lista de `ReservationDTO`, ignorar las primeras 5 reservas que tengan más de 2 pasajeros. 
- **Omitir los primeros 3 pasajeros con documento tipo "DNI"**: En una lista de `PassengerDTO`, ignorar los primeros 3 pasajeros cuyo `documentType` sea "DNI".

### **limit**
- **Obtener solo las primeras 5 reservas**: A partir de una lista de `ReservationDTO`, quedarse solo con las primeras 5.
- **Seleccionar los 3 pasajeros más jóvenes**: Ordenar una lista de `PassengerDTO` por edad y tomar solo los 3 más jóvenes.
- **Tomar las 2 reservas más antiguas**: Ordenar la lista por `creationDate` y obtener las 2 más antiguas.
- **Tomar solo los primeros 4 pasajeros con correo corporativo**: De una lista de `PassengerDTO`, seleccionar los primeros 4 pasajeros cuyo correo termine en `@empresa.com`.
- **Seleccionar los 3 itinerarios más caros**: Ordenar una lista de `ItineraryDTO` por `totalPrice` de mayor a menor y tomar solo los 3 primeros.


### ***Combinando operadores***
- **Obtener las reservas de la posición 5 a la 10**: Dada una lista de `ReservationDTO`, omitir las primeras 5 reservas y tomar las siguientes 5.
- **Obtener los pasajeros de la posición 3 a la 8**: Dada una lista de `PassengerDTO`, omitir los 3 primeros y tomar los siguientes 5.
- **Seleccionar las reservas creadas en los últimos 3 meses, saltando las 2 más recientes**: Filtrar las reservas creadas en los últimos 3 meses, omitir las 2 más recientes y tomar las siguientes 5.
  Aquí tienes los ejercicios con enunciados en una sola oración:
- **Obtener los 5 pasajeros más jóvenes** ordenando por fecha de nacimiento descendente después de filtrar aquellos con una fecha de nacimiento válida y limitando el resultado a cinco.
- **Listar las 3 reservas más recientes** ordenando por fecha de creación en orden descendente después de filtrar las reservas con una fecha de creación no nula y limitando el resultado a tres.
- **Obtener los 10 itinerarios más caros** ordenando por precio total en orden descendente después de filtrar los itinerarios con un precio válido y limitando el resultado a diez.
- **Seleccionar los primeros 2 pasajeros cuyo documento comience con "A"** ordenando alfabéticamente por número de documento después de filtrar los pasajeros cuyo documento comienza con "A" y limitando el resultado a dos.
