# Ejercicios: Modulo 3 - Clase 5

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

### **partitioningBy**
- **Particionar pasajeros por ser mayores de 18 años o no**: Usar `partitioningBy` para dividir una lista de PassengerDTO en dos grupos según si su edad es mayor o igual a 18.
- **Particionar reservas según tengan más de 2 pasajeros**: Usar `partitioningBy` para dividir una lista de ReservationDTO en reservas con más de 2 pasajeros y las que tengan 2 o menos.
- **Particionar itinerarios según totalPrice superior a 500**: Usar `partitioningBy` para separar ItineraryDTO en dos grupos basados en si su PriceDTO.totalPrice es mayor a 500.
- **Particionar pasajeros por documento tipo "Pasaporte"**: Usar `partitioningBy` para dividir PassengerDTO en aquellos cuyo documentType es "Pasaporte" y los que no lo son.
- **Particionar itinerarios por tener al menos 2 segmentos**: Usar `partitioningBy` para dividir ItineraryDTO en dos grupos según si su lista de SegmentDTO tiene tamaño mayor o igual a 2.
- **Particionar reservas según la creationDate esté en el último mes**: Usar `partitioningBy` para separar ReservationDTO en reservas creadas dentro de los últimos 30 días y las que no.


### **groupingBy**
- **Agrupar pasajeros por documentType**: Usar `groupingBy` para agrupar una lista de PassengerDTO según su documentType.
- **Agrupar reservas por el año de creación**: Usar `groupingBy` para clasificar ReservationDTO según el año extraído de su creationDate.
- **Agrupar itinerarios por cantidad de segmentos**: Usar `groupingBy` para agrupar ItineraryDTO según el tamaño de su lista de SegmentDTO.
- **Agrupar pasajeros por la inicial de su lastName**: Usar `groupingBy` para clasificar PassengerDTO según la primera letra de su lastName.
- **Agrupar itinerarios por rango de totalPrice**: Usar `groupingBy` para clasificar ItineraryDTO en categorías de precio (por ejemplo, "bajo", "medio", "alto") según PriceDTO.totalPrice.
- **Agrupar reservas por el número de pasajeros**: Usar `groupingBy` para agrupar ReservationDTO según la cantidad de PassengerDTO que contienen.


### **groupingByConcurrent**
- **Agrupar concurrentemente reservas por año de creación**: Usar `groupingByConcurrent` para clasificar ReservationDTO por el año extraído de su creationDate en un entorno paralelo.
- **Agrupar concurrentemente pasajeros por documentType**: Usar `groupingByConcurrent` para agrupar PassengerDTO según su documentType en un stream paralelo.
- **Agrupar concurrentemente itinerarios por cantidad de segmentos**: Usar `groupingByConcurrent` para clasificar ItineraryDTO según el tamaño de su lista de SegmentDTO.
- **Agrupar concurrentemente pasajeros por la inicial de lastName**: Usar `groupingByConcurrent` para agrupar PassengerDTO por la primera letra de su lastName.
- **Agrupar concurrentemente reservas en recientes y antiguas**: Usar `groupingByConcurrent` para separar ReservationDTO en dos grupos, según si su creationDate es dentro del último mes o no.
- **Agrupar concurrentemente itinerarios por basePrice en rangos**: Usar `groupingByConcurrent` para clasificar ItineraryDTO en rangos de PriceDTO.basePrice (por ejemplo, menos de 200, entre 200 y 500, más de 500).


### **collectingAndThen**
- **Obtener una lista inmutable de nombres de pasajeros**: Usar `collectingAndThen` para recolectar los firstName de PassengerDTO en una lista y transformarla en inmutable.
- **Contar las reservas y devolver el resultado como String**: Usar `collectingAndThen` para contar ReservationDTO y luego transformar el número a una cadena formateada.
- **Obtener el pasajero más joven y devolver su nombre en mayúsculas**: Usar `collectingAndThen` junto con `minBy` para encontrar al PassengerDTO con birthday más reciente y transformar su firstName a mayúsculas.
- **Calcular el precio total acumulado de todas las reservas y formatearlo**: Usar `collectingAndThen` para sumar PriceDTO.totalPrice de las reservas y luego formatear el resultado como un String.
- **Obtener el itinerario más caro y devolverlo envuelto en Optional**: Usar `collectingAndThen` junto con `maxBy` para encontrar el ItineraryDTO con mayor PriceDTO.totalPrice y convertirlo a Optional si no se encuentra ninguno.
- **Recolectar los correos electrónicos de pasajeros en una lista y luego ordenarla**: Usar `collectingAndThen` para recolectar los emails de PassengerDTO en una lista y, a continuación, ordenarla antes de devolverla.
