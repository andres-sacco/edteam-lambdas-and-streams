# Ejercicios: Modulo 2 - Clase 1

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **filter**
- **Filtrar reservas recientes:** Obtener una lista de reservas creadas en los últimos 7 días.
- **Filtrar pasajeros mayores de edad:** Obtener solo los pasajeros que tienen 18 años o más.
- **Filtrar reservas con precio total mayor a 500:** Obtener todas las reservas donde el `totalPrice` sea mayor a 500.
- **Filtrar pasajeros con un correo de dominio específico:** Obtener los pasajeros cuyo email termine en "@empresa.com".
- **Filtrar itinerarios con más de un segmento:** Obtener los itinerarios que tengan más de un segmento en la lista `segment`.


### **takeWhile**
- **Obtener reservas ordenadas por fecha hasta la primera reserva antigua:** Suponiendo que la lista de reservas está ordenada por `creationDate`, obtener todas las reservas hasta encontrar la primera con más de un año de antigüedad.
- **Obtener pasajeros de una reserva hasta el primero menor de edad:** Suponiendo que los pasajeros están ordenados por edad, obtener todos los pasajeros hasta el primero que tenga menos de 18 años.
- **Obtener segmentos de un itinerario hasta el primero con precio base mayor a 200:** Obtener todos los segmentos de un itinerario hasta encontrar uno cuyo `basePrice` sea mayor a 200.
- **Obtener itinerarios hasta el primero con un totalPrice menor a 100:** Obtener los itinerarios en una lista hasta encontrar el primero con un `totalPrice` menor a 100.
- **Obtener pasajeros de un itinerario hasta encontrar uno con documento de tipo "Pasaporte":** Obtener todos los pasajeros de una lista hasta el primero que tenga `documentType` como "Pasaporte".


### **dropWhile**
- **Ignorar reservas antiguas y obtener solo las más recientes:** Suponiendo que la lista de reservas está ordenada por `creationDate`, descartar todas las reservas anteriores a los últimos 30 días y quedarse solo con las más recientes.
- **Ignorar pasajeros menores de edad y obtener solo los adultos:** Suponiendo que los pasajeros están ordenados por edad, descartar los menores de 18 años y quedarse con los adultos.
- **Descartar segmentos de un itinerario con precio base bajo:** En un itinerario ordenado por `basePrice`, eliminar los segmentos con precio menor a 100 y quedarse solo con los que superen ese valor.
- **Eliminar pasajeros con correos de un dominio no deseado:** Dada una lista ordenada de pasajeros, eliminar todos aquellos cuyo email no termine en "@empresa.com".
- **Descartar reservas con totalPrice bajo y quedarse con las más costosas:** En una lista ordenada por `totalPrice`, eliminar las reservas cuyo total sea menor a 300 y quedarse con las más costosas.
