![Diagrama_page-0001](https://github.com/user-attachments/assets/040b1763-d32d-40d8-badb-7538396eda38)
# Campeonato

Este proyecto es una aplicación de consola en Java para gestionar equipos de fútbol, ingresar datos de jugadores, y calcular estadísticas de los equipos y jugadores. También determina el equipo ganador basado en el número de goles y muestra la información detallada de cada equipo.

## Uso

Sigue las instrucciones en pantalla para ingresar los datos requeridos:

1. Ingrese los datos del director, supervisor y árbitro.
2. Ingrese los detalles del Equipo A y Equipo B, incluyendo titulares y suplentes.
3. Ingrese el equipo ganador (A, B, o empate).
4. Opcionalmente, puedes agregar más equipos y repetir el proceso.
5. Después de ingresar los equipos, el programa mostrará las estadísticas y el equipo ganador.

![Diagrama](https://github.com/user-attachments/assets/040b1763-d32d-40d8-badb-7538396eda38)

## Importaciones

java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
Estas importaciones permiten:

ArrayList y List: Manipular colecciones de objetos dinámicamente.
Scanner: Leer la entrada del usuario desde la consola.

# Explicacion del main
Inicialización:

Se crea un objeto Scanner para leer la entrada del usuario.
Se inicializa una lista equipos para almacenar los objetos Equipo.
Ingreso de Datos:

Solicita datos del director, supervisor y árbitro.
Permite ingresar detalles para el Equipo A y Equipo B, incluyendo titulares y suplentes. El número de titulares y suplentes para el Equipo B será el mismo que para el Equipo A.
Pregunta el equipo ganador y, opcionalmente, el número de campeonatos si hay un ganador.
Opciones Adicionales:

Permite volver a ingresar los detalles del equipo ganador si se elige hacerlo.
Ofrece la opción de agregar más equipos.
Mostrar Estadísticas:

Muestra datos detallados de cada equipo, incluyendo titulares, suplentes, goles totales, faltas totales y puntos.
Muestra una tabla de posiciones con estadísticas individuales de cada jugador y del equipo.
Manejo de Errores:

Incluye un bloque try-catch para capturar y manejar excepciones que puedan ocurrir durante la ejecución.

# Ejemplo de ejecucion

![image](https://github.com/user-attachments/assets/90d2a399-9c80-49e6-abcc-d46f42df9d90)
![image](https://github.com/user-attachments/assets/b68fd9b2-815e-4756-832b-038cd4a0c30f)
![image](https://github.com/user-attachments/assets/9763115f-ce59-465a-8ee8-f5c8ae6144d7)
![image](https://github.com/user-attachments/assets/20bb4f9e-bf4a-46f8-9cf8-ef34b07b9d43)
![image](https://github.com/user-attachments/assets/24d65612-514c-4140-9d7c-cab41de327c7)
![image](https://github.com/user-attachments/assets/8850cf6a-2642-4c37-8847-c29b48b893a2)

## Recomendaciones

- Asegúrate de seguir las instrucciones en pantalla para una correcta ejecución del programa.
- Verifica que los datos ingresados sean correctos para evitar errores en el cálculo de estadísticas.
- Si decides agregar más equipos, sigue el mismo formato de ingreso de datos.
