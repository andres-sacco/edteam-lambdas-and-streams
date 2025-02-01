# Ejercicios: Modulo 3 - Clase 3

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **forEach**
- **Imprimir el firstName y lastName de cada pasajero**: Usar `forEach` para recorrer una lista de PassengerDTO e imprimir en consola el nombre completo de cada pasajero.
- **Mostrar la creationDate de cada reserva**: Usar `forEach` para recorrer una lista de ReservationDTO e imprimir la fecha de creación de cada reserva.
- **Enviar notificaciones a pasajeros**: Usar `forEach` para recorrer una lista de PassengerDTO e imprimir un mensaje simulando el envío de notificación a su email.
- **Imprimir el id de cada itinerario**: Usar `forEach` para recorrer una lista de ItineraryDTO e imprimir el identificador de cada itinerario.
- **Mostrar el totalPrice de cada PriceDTO**: Usar `forEach` para iterar sobre una lista de PriceDTO e imprimir el precio total de cada objeto.
- **Imprimir el documentNumber de cada pasajero**: Usar `forEach` para recorrer una lista de PassengerDTO e imprimir el número de documento de cada pasajero.

### **forEachOrdered**
- **Imprimir en orden los firstName de cada pasajero**: Usar `forEachOrdered` en un stream de PassengerDTO para imprimir en el orden original el nombre de cada pasajero.
- **Mostrar en orden las creationDate de las reservas**: Usar `forEachOrdered` para recorrer una lista de ReservationDTO e imprimir las fechas de creación respetando el orden de la lista.
- **Imprimir en orden los documentNumber de cada pasajero**: Usar `forEachOrdered` para recorrer una lista de PassengerDTO e imprimir el número de documento en el orden original.
- **Imprimir en orden el id de cada itinerario**: Usar `forEachOrdered` para recorrer una lista de ItineraryDTO e imprimir el id de cada itinerario respetando el orden.
- **Mostrar en orden el basePrice de cada PriceDTO**: Usar `forEachOrdered` para recorrer una lista de PriceDTO e imprimir el precio base en el orden original.
- **Imprimir en orden los emails de los pasajeros**: Usar `forEachOrdered` para recorrer una lista de PassengerDTO e imprimir en orden cada email.

### **iterator**
- **Imprimir el firstName de cada pasajero**: Usar un Iterator para recorrer una lista de PassengerDTO e imprimir el nombre de cada pasajero.
- **Contar reservas con creationDate no nula**: Usar un Iterator para recorrer una lista de ReservationDTO y contar cuántas tienen una fecha de creación definida.
- **Recopilar los id de los itinerarios**: Usar un Iterator para recorrer una lista de ItineraryDTO y agregar cada id a una nueva lista.
- **Eliminar pasajeros sin email**: Usar un Iterator para recorrer una lista de PassengerDTO y eliminar aquellos cuyo email sea nulo o esté vacío.
- **Imprimir el totalTax de cada PriceDTO**: Usar un Iterator para recorrer una lista de PriceDTO e imprimir el impuesto total de cada objeto.
- **Imprimir el documentNumber de cada pasajero**: Usar un Iterator para recorrer una lista de PassengerDTO e imprimir el número de documento de cada pasajero.

### **peek**
- **Depurar el firstName de cada pasajero**: Usar `peek` en un stream de PassengerDTO para imprimir el firstName de cada pasajero antes de aplicar otras operaciones.
- **Mostrar el id de cada reserva durante el filtrado**: Usar `peek` en un stream de ReservationDTO para imprimir el id de cada reserva mientras se filtra por una condición de fecha.
- **Verificar el número de segmentos en cada itinerario**: Usar `peek` en un stream de ItineraryDTO para imprimir la cantidad de segmentos de cada itinerario durante el procesamiento.
- **Depurar los documentNumber en un stream de pasajeros**: Usar `peek` en un stream de PassengerDTO para imprimir el documentNumber de cada pasajero antes de mapear a nombres completos.
- **Mostrar el basePrice de cada PriceDTO**: Usar `peek` en un stream de PriceDTO para imprimir el precio base de cada objeto antes de realizar una operación de reducción.
- **Depurar el email de cada pasajero**: Usar `peek` en un stream de PassengerDTO para imprimir el email de cada pasajero antes de filtrar aquellos con email nulo o vacío.