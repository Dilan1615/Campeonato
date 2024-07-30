import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del Director
        System.out.print("Ingrese nombre del Director: ");
        String nombreDirector = scanner.nextLine();
        System.out.print("Ingrese cédula del Director: ");
        String cedulaDirector = scanner.nextLine();
        System.out.print("Ingrese sexo del Director: ");
        String sexoDirector = scanner.nextLine();
        
        // Leer ID del Director, manejando la entrada del entero correctamente
        int idDirector = 0;
        System.out.print("Ingrese ID del Director: ");
        if (scanner.hasNextInt()) {
            idDirector = scanner.nextInt();
        } else {
            System.out.println("Error: ID del Director debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea

        Director director1 = new Director(nombreDirector, cedulaDirector, sexoDirector, idDirector);

        // Ingresar datos del Supervisor
        System.out.print("Ingrese nombre del Supervisor: ");
        String nombreSupervisor = scanner.nextLine();
        System.out.print("Ingrese cédula del Supervisor: ");
        String cedulaSupervisor = scanner.nextLine();
        System.out.print("Ingrese sexo del Supervisor: ");
        String sexoSupervisor = scanner.nextLine();
        
        // Leer ID del Supervisor, manejando la entrada del entero correctamente
        int idSupervisor = 0;
        System.out.print("Ingrese ID del Supervisor: ");
        if (scanner.hasNextInt()) {
            idSupervisor = scanner.nextInt();
        } else {
            System.out.println("Error: ID del Supervisor debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea

        Supervisor supervisor1 = new Supervisor(nombreSupervisor, cedulaSupervisor, sexoSupervisor, idSupervisor);

        // Ingresar datos del Árbitro
        System.out.print("Ingrese nombre del Árbitro: ");
        String nombreArbitro = scanner.nextLine();
        System.out.print("Ingrese cédula del Árbitro: ");
        String cedulaArbitro = scanner.nextLine();
        System.out.print("Ingrese sexo del Árbitro: ");
        String sexoArbitro = scanner.nextLine();
        
        // Leer ID del Árbitro, manejando la entrada del entero correctamente
        int idArbitro = 0;
        System.out.print("Ingrese ID del Árbitro: ");
        if (scanner.hasNextInt()) {
            idArbitro = scanner.nextInt();
        } else {
            System.out.println("Error: ID del Árbitro debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese rol del Árbitro: ");
        String rolArbitro = scanner.nextLine();

        Arbitro arbitro1 = Arbitro.registrarArbitro(nombreArbitro, cedulaArbitro, sexoArbitro, idArbitro, rolArbitro, null);

        // Ingresar datos del Jugador
        System.out.print("Ingrese nombre del Jugador: ");
        String nombreJugador = scanner.nextLine();
        System.out.print("Ingrese cédula del Jugador: ");
        String cedulaJugador = scanner.nextLine();
        System.out.print("Ingrese sexo del Jugador: ");
        String sexoJugador = scanner.nextLine();
        System.out.print("Ingrese categoría del Jugador: ");
        String categoriaJugador = scanner.nextLine();

        Jugador jugador1 = Jugador.registrarJugador(nombreJugador, cedulaJugador, sexoJugador, categoriaJugador, null);

        // Ingresar datos del Deporte
        System.out.print("Ingrese nombre del Deporte: ");
        String nombreDeporte = scanner.nextLine();
        System.out.print("Ingrese descripción del Deporte: ");
        String descripcionDeporte = scanner.nextLine();

        Deporte deporte1 = Deporte.crearDeporte(nombreDeporte, descripcionDeporte);

        // Ingresar datos del Equipo A
        System.out.print("Ingrese nombre del Equipo A: ");
        String nombreEquipoA = scanner.nextLine();
        System.out.print("Ingrese color del Equipo A: ");
        String colorEquipoA = scanner.nextLine();
        System.out.print("Ingrese entrenador del Equipo A: ");
        String entrenadorEquipoA = scanner.nextLine();
        System.out.print("Ingrese himno del Equipo A: ");
        String himnoEquipoA = scanner.nextLine();

        System.out.println("Ingrese titulares del Equipo A (separados por comas): ");
        String[] titularesA = scanner.nextLine().split(",");
        List<String> titularesEquipoA = new ArrayList<>();
        for (String titular : titularesA) {
            titularesEquipoA.add(titular.trim());
        }

        System.out.println("Ingrese suplentes del Equipo A (separados por comas): ");
        String[] suplentesA = scanner.nextLine().split(",");
        List<String> suplentesEquipoA = new ArrayList<>();
        for (String suplente : suplentesA) {
            suplentesEquipoA.add(suplente.trim());
        }

        Equipo equipoA = new Equipo(nombreEquipoA, colorEquipoA, entrenadorEquipoA, himnoEquipoA, titularesEquipoA, suplentesEquipoA);

        // Ingresar datos del Equipo B
        System.out.print("Ingrese nombre del Equipo B: ");
        String nombreEquipoB = scanner.nextLine();
        System.out.print("Ingrese color del Equipo B: ");
        String colorEquipoB = scanner.nextLine();
        System.out.print("Ingrese entrenador del Equipo B: ");
        String entrenadorEquipoB = scanner.nextLine();
        System.out.print("Ingrese himno del Equipo B: ");
        String himnoEquipoB = scanner.nextLine();

        System.out.println("Ingrese titulares del Equipo B (separados por comas): ");
        String[] titularesB = scanner.nextLine().split(",");
        List<String> titularesEquipoB = new ArrayList<>();
        for (String titular : titularesB) {
            titularesEquipoB.add(titular.trim());
        }

        System.out.println("Ingrese suplentes del Equipo B (separados por comas): ");
        String[] suplentesB = scanner.nextLine().split(",");
        List<String> suplentesEquipoB = new ArrayList<>();
        for (String suplente : suplentesB) {
            suplentesEquipoB.add(suplente.trim());
        }

        Equipo equipoB = new Equipo(nombreEquipoB, colorEquipoB, entrenadorEquipoB, himnoEquipoB, titularesEquipoB, suplentesEquipoB);

        // Ingresar datos de la inscripción
        System.out.print("Ingrese deporte de la Inscripción: ");
        String deporteInscripcion = scanner.nextLine();
        System.out.print("Ingrese NCI de la Inscripción: ");
        String NCIInscripcion = scanner.nextLine();
        System.out.print("Ingrese número de participantes: ");
        int numParticipantes = 0;
        if (scanner.hasNextInt()) {
            numParticipantes = scanner.nextInt();
        } else {
            System.out.println("Error: Número de participantes debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese estado de la Inscripción: ");
        String estadoInscripcion = scanner.nextLine();

        Inscripcion inscripcion = new Inscripcion(deporteInscripcion, NCIInscripcion, numParticipantes, new Date(), estadoInscripcion);

        // Crear inscripción de equipo
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        InscripcionEquipo inscripcionEquipo = new InscripcionEquipo(jugadores);

        // Crear inscripción individual
        InscripcionIndividual inscripcionIndividual = new InscripcionIndividual(jugador1);

        // Ingresar datos de las jornadas
        System.out.print("Ingrese nombre de las Jornadas: ");
        String nombreJornadas = scanner.nextLine();

        System.out.println("Ingrese jornadas (separadas por comas): ");
        String[] jornadasArray = scanner.nextLine().split(",");
        List<String> jornadasList = new ArrayList<>();
        for (String jornada : jornadasArray) {
            jornadasList.add(jornada.trim());
        }

        Jornadas jornadas = new Jornadas(nombreJornadas, jornadasList);

        // Ingresar datos del registro
        System.out.print("Ingrese nombre del Registro: ");
        String nombreRegistro = scanner.nextLine();
        System.out.print("Ingrese ID del Registro: ");
        int idRegistro = 0;
        if (scanner.hasNextInt()) {
            idRegistro = scanner.nextInt();
        } else {
            System.out.println("Error: ID del Registro debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea

        Registro registro = new Registro(nombreRegistro, idRegistro);
        registro.realizarRegistro();
        registro.registrarEncuentro();

        // Ingresar datos del resultado
        System.out.print("Ingrese ID del Resultado: ");
        int idResultado = 0;
        if (scanner.hasNextInt()) {
            idResultado = scanner.nextInt();
        } else {
            System.out.println("Error: ID del Resultado debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea

        Resultado resultado = new Resultado(idResultado);

        // Ingresar datos de la suspensión
        System.out.print("Ingrese motivo de la Suspensión: ");
        String motivoSuspension = scanner.nextLine();
        System.out.print("Ingrese tipo de la Suspensión: ");
        String tipoSuspension = scanner.nextLine();
        System.out.print("Ingrese tiempo de la Suspensión: ");
        String tiempoSuspension = scanner.nextLine();

        Suspension suspension = new Suspension(motivoSuspension, tipoSuspension, tiempoSuspension);

        // Ingresar datos de la tabla de posición
        System.out.print("Ingrese posición en la tabla: ");
        int posicionTabla = 0;
        if (scanner.hasNextInt()) {
            posicionTabla = scanner.nextInt();
        } else {
            System.out.println("Error: Posición en la tabla debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        System.out.print("Ingrese ID de la tabla: ");
        int idTabla = 0;
        if (scanner.hasNextInt()) {
            idTabla = scanner.nextInt();
        } else {
            System.out.println("Error: ID de la tabla debe ser un número entero.");
            scanner.next(); // Limpiar el input incorrecto
        }
        scanner.nextLine(); // Consumir el salto de línea

        TablaPosicion tablaPosicion = new TablaPosicion(posicionTabla, idTabla);
        tablaPosicion.ordenarEstadisticas();
        tablaPosicion.crearTabla();

        // Llamar a métodos relevantes para probar la funcionalidad
        director1.addDT();
        supervisor1.metodoEspecifico();
        arbitro1.obtenerArbitro();
        jugador1.obtenerJugador();
        deporte1.obtenerDeporte(1);
        equipoA.definirEquipo();
        equipoB.definirEquipo();
        
        // Cierre del scanner
        scanner.close();
    }
}
