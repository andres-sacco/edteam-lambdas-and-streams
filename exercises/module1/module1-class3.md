# Ejercicios: Modulo 1 - Clase 3

Aqui encontraras una serie de ejercicios para poder practicar los conceptos relacionados con esta clase

## Generales
En esta seccion encontraras ejercicios genericos sin ningun tipo de relacion con el modelo de dominio del curso.

### Consumer
- **Imprimir los elementos de una lista**: Crea un `Consumer` que tome una lista de elementos y la imprima en la consola.
- **Modificar un número**: Crea un `Consumer` que tome un número entero y lo incremente en 1, luego imprima el resultado.
- **Imprimir la longitud de una cadena**: Crea un `Consumer` que tome una cadena de texto y imprima su longitud.
- **Imprimir la fecha y hora actual**: Crea un `Consumer` que imprima la fecha y hora actual en formato `yyyy-MM-dd HH:mm:ss`.
- **Imprimir un mensaje personalizado**: Crea un `Consumer` que tome un nombre (cadena) y imprima un mensaje personalizado, como "Hola, [nombre]".
- **Imprimir los elementos de un mapa**: Crea un `Consumer` que tome un mapa (`Map<K, V>`) e imprima sus claves y valores.
- **Imprimir los números pares de una lista**: Crea un `Consumer` que tome una lista de números enteros e imprima solo los números pares.

###  Supplier
- **Generar un número aleatorio**: Crea un `Supplier` que genere y devuelva un número aleatorio entre 1 y 100.
- **Obtener la fecha y hora actual**: Crea un `Supplier` que devuelva la fecha y hora actual en formato String.
- **Obtener el nombre del sistema operativo**: Crea un `Supplier` que devuelva el nombre del sistema operativo en el que se está ejecutando el programa.
- **Generar una lista de números primos**: Crea un `Supplier` que genere una lista de los primeros 10 números primos.
- **Obtener la memoria libre de la JVM**: Crea un `Supplier` que devuelva la cantidad de memoria libre actual en la JVM (Java Virtual Machine) en megabytes.
- **Obtener la ruta del directorio de trabajo actual**: Crea un `Supplier` que devuelva la ruta del directorio de trabajo actual (working directory) del programa.
- **Generar una cadena aleatoria de longitud fija**: Crea un `Supplier` que genere una cadena aleatoria de longitud fija (por ejemplo, 10 caracteres) usando letras mayúsculas y minúsculas.
- **Generar un UUID aleatorio**: Crea un `Supplier` que genere y devuelva un UUID (Identificador Único Universal) aleatorio.

### UnaryOperator
- **Incrementar un número en 1**: Crea un `UnaryOperator` que tome un número entero y lo incremente en 1.
- **Convertir una cadena a mayúsculas**: Crea un `UnaryOperator` que tome una cadena y la convierta a mayúsculas.
- **Duplicar un número**: Crea un `UnaryOperator` que tome un número y lo duplique.
- **Calcular el valor absoluto de un número**: Crea un `UnaryOperator que tome un número entero y devuelva su valor absoluto.
- **Incrementar un número en un 10%**: Crea un `UnaryOperator` que tome un número decimal y lo incremente en un 10%.
- **Eliminar espacios en blanco de una cadena**: Crea un `UnaryOperator` que tome una cadena de texto y elimine todos los espacios en blanco.
- **Reemplazar vocales por asteriscos**: Crea un `UnaryOperator` que tome una cadena de texto y reemplace todas las vocales por el carácter *.
- **Redondear un número decimal**: Crea un `UnaryOperator` que tome un número decimal y lo redondee al entero más cercano.


### BinaryOperator
- **Sumar dos números**: Crea un `BinaryOperator` que sume dos números enteros.
- **Encontrar el máximo de dos números**: Crea un `BinaryOperator` que devuelva el máximo de dos números enteros.
- **Combinar dos listas**: Crea un BinaryOperator` que combine dos listas de enteros en una sola lista.
- **Concatenar dos cadenas**: Crea un `BinaryOperator` que concatene dos cadenas de texto.
- **Multiplicar dos números**: Crea un `BinaryOperator` que multiplique dos números decimales.
- **Calcular el promedio de dos números**: Crea un `BinaryOperator` que calcule el promedio de dos números enteros.
- **Combinar dos mapas**: Crea un `BinaryOperator` que combine dos mapas, sumando los valores de las claves comunes.
- **Calcular la potencia de dos números**: Crea un `BinaryOperator` que calcule la potencia de un número elevado a otro.

### Predicate
- **Verificar si una lista está vacía**: Crea un `Predicate` que verifique si una lista de elementos está vacía.
- **Verificar si un número es positivo**: Crea un `Predicate` que verifique si un número entero es positivo.
- **Verificar si una cadena tiene más de 5 caracteres**: Crea un `Predicate` que verifique si una cadena de texto tiene más de 5 caracteres.
- **Verificar si un número está en un rango específico**: Crea un `Predicate` que verifique si un número entero está dentro de un rango específico, por ejemplo, entre 10 y 20.
- **Verificar si un objeto es nulo**: Crea un `Predicate` que verifique si un objeto es nulo (`null`).
- **Verificar si una cadena contiene una subcadena específica**: Crea un `Predicate` que verifique si una cadena de texto contiene una subcadena específica (por ejemplo, "Java").
- **Verificar si una lista contiene un elemento específico**: Crea un `Predicate` que verifique si una lista de enteros contiene un número específico.


### Combinados
- **Generar y transformar un número**: Usa un `Supplier` para generar un número aleatorio entre 1 y 100, y luego usa un `UnaryOperator` para incrementar ese número en 10.
- **Generar una cadena y transformarla**: Usa un `Supplier` para generar una cadena con la fecha y hora actual, y luego usa un `UnaryOperator` para convertirla a mayúsculas.


## Especificas
En esta seccion encontraras ejercicios conectados con el modelo de dominio del curso acerca de las reservas.

### Consumer
- **Imprimir los detalles de una reserva**: Crea un `Consumer<ReservationDTO>` que muestre en consola la información de una reserva.
- **Enviar una notificación a un pasajero**: Define un `Consumer<PassengerDTO>` que tome un pasajero y simule el envío de una notificación a su correo electrónico.
- **Aplicar un descuento a un itinerario**: Implementa un `Consumer<ItineraryDTO>` que reduzca el precio del itinerario en un 10%.
- **Actualizar la fecha de creación de una reserva**: Diseña un `Consumer<ReservationDTO>` que modifique la fecha de creación de la reserva al día actual.
- **Marcar un pasajero como VIP**: Crea un `Consumer<PassengerDTO>` que agregue una marca especial a los pasajeros con más de 10 reservas previas.


###  Supplier
- **Generar una nueva reserva vacía**: Crea un `Supplier<ReservationDTO>` que devuelva una nueva instancia de `ReservationDTO` con valores predeterminados.
- **Crear un pasajero de prueba**: Define un `Supplier<PassengerDTO>` que genere un pasajero con datos ficticios para pruebas.
- **Producir una fecha actual**: Implementa un `Supplier<LocalDate>` que devuelva la fecha actual del sistema.
- **Generar un identificador aleatorio para una reserva**: Diseña un `Supplier<Long>` que genere un ID único para asignarlo a nuevas reservas.
- **Obtener un itinerario de ejemplo**: Crea un `Supplier<ItineraryDTO>` que devuelva un itinerario predefinido con datos simulados.

### UnaryOperator
- **Incrementar días en una reserva**: Crea un `UnaryOperator<ReservationDTO>` que aumente la fecha de creación de la reserva en un número específico de días.
- **Normalizar nombres de pasajeros**: Define un `UnaryOperator<PassengerDTO>` que transforme el nombre de un pasajero a minúsculas y elimine espacios en blanco al inicio y al final.
- **Aplicar un descuento a un itinerario**: Implementa un `UnaryOperator<ItineraryDTO>` que reduzca en un 10% el precio total de un itinerario.
- **Asignar un identificador único a una reserva**: Diseña un `UnaryOperator<ReservationDTO>` que, si la reserva no tiene un ID asignado, le asigne un ID generado aleatoriamente.
- **Convertir una fecha de creación a formato UTC**: Crea un `UnaryOperator<ReservationDTO>` que transforme la fecha de creación de la reserva a formato UTC si aún no está en ese formato.

### BinaryOperator
- **Combinar dos listas de pasajeros**: Crea un `BinaryOperator<List<PassengerDTO>>` que fusione dos listas de pasajeros en una sola sin duplicados.
- **Actualizar la fecha de creación de una reserva**: Define un `BinaryOperator<ReservationDTO>` que tome dos reservas y establezca en la primera la fecha de creación más reciente de ambas.
- **Sumar dos precios de itinerarios**: Implementa un `BinaryOperator<ItineraryDTO>` que combine dos itinerarios sumando sus costos totales.
- **Determinar la reserva más antigua**: Diseña un `BinaryOperator<ReservationDTO>` que compare dos reservas y devuelva la más antigua según su fecha de creación.
- **Fusionar dos itinerarios en uno**: Crea un `BinaryOperator<ItineraryDTO>` que tome dos itinerarios y devuelva uno nuevo combinando sus destinos y horarios.

### Predicate
- **Verificar si una reserva tiene pasajeros**: Crea un `Predicate<ReservationDTO>` que devuelva `true` si la lista de pasajeros no está vacía.
- **Validar si un pasajero es mayor de edad**: Define un `Predicate<PassengerDTO>` que determine si un pasajero tiene 18 años o más.
- **Comprobar si un itinerario tiene más de un destino**: Implementa un `Predicate<ItineraryDTO>` que devuelva `true` si el itinerario incluye más de una parada.
- **Filtrar reservas creadas en el último mes**: Diseña un `Predicate<ReservationDTO>` que valide si la fecha de creación es dentro de los últimos 30 días.
- **Identificar pasajeros con correo electrónico válido**: Crea un `Predicate<PassengerDTO>` que verifique si el email del pasajero tiene un formato válido.

### Combinados
- **Filtrar y mostrar pasajeros mayores de edad**: Usa un `Predicate<PassengerDTO>` para verificar si un pasajero es mayor de 18 años y un `Consumer<PassengerDTO>` para imprimir su información si cumple la condición.
- **Generar una reserva y actualizar su fecha de creación**: Usa un `Supplier<ReservationDTO>` para crear una nueva reserva y un `Consumer<ReservationDTO>` para establecer la fecha de creación al día actual.
- **Combinar dos listas de pasajeros y mostrarlas**: Utiliza un `BinaryOperator<List<PassengerDTO>>` para fusionar dos listas sin duplicados y un `Consumer<List<PassengerDTO>>` para imprimir la lista final.
- **Aplicar un descuento a un itinerario si el precio es alto**: Usa un `Predicate<ItineraryDTO>` para comprobar si el precio del itinerario es mayor a cierto umbral y un `UnaryOperator<ItineraryDTO>` para reducir el precio en un porcentaje si se cumple la condición.
- **Crear un pasajero y verificar si tiene correo válido**: Define un `Supplier<PassengerDTO>` para generar un nuevo pasajero y un `Predicate<PassengerDTO>` para validar si su email es correcto antes de guardarlo en una base de datos.