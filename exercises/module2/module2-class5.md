# Ejercicios: Modulo 2 - Clase 5

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **distinct**
- **Obtener pasajeros únicos por documento**: Dada una lista de `PassengerDTO`, eliminar los duplicados considerando solo el `documentNumber`.
- **Obtener itinerarios únicos**: De una lista de `ItineraryDTO`, eliminar aquellos que tengan el mismo `id`.
- **Lista de reservas sin duplicados**: Filtrar una lista de `ReservationDTO` para conservar solo una reserva por `itineraryId`, eliminando duplicados.
- **Obtener correos únicos de pasajeros**: A partir de una lista de `PassengerDTO`, obtener una lista de correos electrónicos únicos.
- **Lista de precios base distintos**: Extraer todos los valores de `basePrice` de `PriceDTO` en una lista y eliminar los repetidos.
- **Eliminar segmentos duplicados en un itinerario**: En un `ItineraryDTO`, asegurarse de que la lista de `SegmentDTO` no tenga segmentos repetidos por `id`.
- **Obtener nombres únicos de pasajeros**: Extraer los nombres de una lista de `PassengerDTO` y asegurarse de que cada nombre aparezca solo una vez.

### ***Combinando operadores***
- **Obtener una lista de pasajeros únicos ordenados alfabéticamente** filtrando aquellos con un correo electrónico válido, eliminando duplicados y ordenando por nombre.
- **Listar las reservas únicas más recientes** filtrando aquellas con más de un pasajero, eliminando duplicados y ordenando por fecha de creación en orden descendente.
- **Obtener los itinerarios con precios distintos más altos** filtrando los que tienen un precio mayor a cero, eliminando duplicados y ordenando por precio total en orden descendente.
- **Seleccionar pasajeros con apellidos distintos ordenados por fecha de nacimiento** filtrando aquellos con una fecha de nacimiento válida, eliminando duplicados por apellido y ordenando en orden ascendente por fecha de nacimiento.