# Ejercicios: Modulo 3 - Clase 4

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase


### **findFirst**
- **Obtener el primer pasajero de la lista**: Usar `findFirst` para recuperar el primer PassengerDTO de una lista.
- **Encontrar la primera reserva con creationDate no nula**: Usar `findFirst` para obtener la primera ReservationDTO cuyo creationDate sea distinto de nulo.
- **Obtener el primer itinerario cuyo totalPrice supere 500**: Usar `findFirst` en una lista de ItineraryDTO filtrando por PriceDTO.totalPrice > 500.-
- **Encontrar el primer pasajero con documentType igual a "Pasaporte"**: Usar `findFirst` para recuperar el primer PassengerDTO cuyo documentType sea "Pasaporte".
- **Obtener la primera reserva que tenga más de 3 pasajeros**: Usar `findFirst` para filtrar ReservationDTO que posean una lista de passengers con tamaño mayor a 3.
- **Encontrar el primer itinerario que contenga al menos dos segmentos**: Usar `findFirst` para obtener el primer ItineraryDTO cuya lista de SegmentDTO tenga tamaño mayor o igual a 2.

### **findAny**
- **Obtener cualquier pasajero con email válido**: Usar `findAny` para recuperar un PassengerDTO cuyo email no sea nulo ni vacío.
- **Encontrar cualquier reserva con totalPrice mayor a 1000**: Usar `findAny` para filtrar y obtener una ReservationDTO cuyo PriceDTO.totalPrice supere 1000.
- **Obtener cualquier itinerario con más de un segmento**: Usar `findAny` para recuperar un ItineraryDTO cuya lista de segmentos tenga más de un elemento.
- **Encontrar cualquier pasajero mayor a 30 años**: Usar `findAny` para recuperar un PassengerDTO cuyo cálculo de edad (basado en birthday) sea mayor a 30.
- **Obtener cualquier reserva creada en el último mes**: Usar `findAny` para recuperar una ReservationDTO con creationDate dentro de los últimos 30 días.
- **Encontrar cualquier itinerario con basePrice superior a 200**: Usar `findAny` para filtrar ItineraryDTO cuyo PriceDTO.basePrice sea mayor a 200.

### **anyMatch**
- **Verificar si existe al menos un pasajero con documentType "Pasaporte"**: Usar `anyMatch` en una lista de PassengerDTO para confirmar la existencia de alguno con documentType igual a "Pasaporte".
- **Comprobar si alguna reserva tiene más de 5 pasajeros**: Usar `anyMatch` en ReservationDTO para determinar si al menos una tiene passengers.size() mayor a 5.
- **Verificar si existe algún itinerario con totalPrice inferior a 100**: Usar `anyMatch` para comprobar si alguna ItineraryDTO tiene PriceDTO.totalPrice menor a 100.
- **Confirmar si al menos un pasajero posee email corporativo (@empresa.com)**: Usar `anyMatch` para determinar si existe un PassengerDTO cuyo email contenga "@empresa.com".
- **Verificar si existe al menos una reserva creada en el año actual**: Usar `anyMatch` en ReservationDTO para confirmar si alguna tiene creationDate en el año en curso.
- **Determinar si algún itinerario cuenta con más de 3 segmentos**: Usar `anyMatch` en una lista de ItineraryDTO para comprobar si existe al menos uno con más de 3 SegmentDTO.


### **allMatch**
- **Verificar si todos los pasajeros tienen correo electrónico**: Usar `allMatch` en PassengerDTO para confirmar que cada pasajero tiene un email no nulo y no vacío.
- **Comprobar que todas las reservas tienen al menos un pasajero**: Usar `allMatch` en ReservationDTO para confirmar que cada reserva contiene al menos un PassengerDTO.
- **Verificar que todos los itinerarios tienen basePrice mayor a cero**: Usar `allMatch` en ItineraryDTO para confirmar que en cada PriceDTO el basePrice es mayor que 0.
- **Confirmar que todos los pasajeros tienen documentType definido**: Usar `allMatch` para asegurar que cada PassengerDTO tiene documentType distinto de nulo.
- **Verificar que todas las reservas tienen creationDate no nula**: Usar `allMatch` en ReservationDTO para comprobar que cada reserva posee una creationDate definida.
- **Asegurarse de que todos los itinerarios tienen al menos dos segmentos**: Usar `allMatch` para confirmar que cada ItineraryDTO tiene una lista de SegmentDTO con tamaño mayor o igual a 2.

### **noneMatch**
- **Verificar que ningún pasajero tenga un email vacío**: Usar `noneMatch` en PassengerDTO para confirmar que ningún pasajero tiene email nulo o vacío.
- **Comprobar que ninguna reserva tenga la lista de pasajeros vacía**: Usar `noneMatch` en ReservationDTO para asegurarse de que ninguna reserva tenga una lista de PassengerDTO sin elementos.
- **Verificar que ningún itinerario tenga totalPrice igual a cero**: Usar `noneMatch` en ItineraryDTO para confirmar que cada PriceDTO tiene totalPrice distinto de 0.
- **Asegurarse de que ningún pasajero tenga un documentNumber nulo**: Usar `noneMatch` en PassengerDTO para verificar que el documentNumber de cada pasajero esté definido.
- **Confirmar que ninguna reserva tenga creationDate en el futuro**: Usar `noneMatch` en ReservationDTO para asegurarse de que ninguna reserva tenga una creationDate posterior a LocalDate.now().
- **Verificar que ningún itinerario tenga una lista de segmentos vacía**: Usar `noneMatch` en ItineraryDTO para confirmar que cada itinerario tenga al menos un SegmentDTO.

