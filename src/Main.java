import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Equipo> equipos = new ArrayList<>();

        try {
            // Ingresar datos del Director
            System.out.print("Ingrese nombre del Director: ");
            String nombreDirector = scanner.nextLine();
            System.out.print("Ingrese cedula del Director: ");
            String cedulaDirector = scanner.nextLine();
            System.out.print("Ingrese sexo del Director: ");
            String sexoDirector = scanner.nextLine();
            int idDirector = leerEntero(scanner, "Ingrese ID del Director: ");
            scanner.nextLine(); // Consumir el salto de línea
            Director director1 = new Director(nombreDirector, cedulaDirector, sexoDirector, idDirector);

            // Ingresar datos del Supervisor
            System.out.print("Ingrese nombre del Supervisor: ");
            String nombreSupervisor = scanner.nextLine();
            System.out.print("Ingrese cedula del Supervisor: ");
            String cedulaSupervisor = scanner.nextLine();
            System.out.print("Ingrese sexo del Supervisor: ");
            String sexoSupervisor = scanner.nextLine();
            int idSupervisor = leerEntero(scanner, "Ingrese ID del Supervisor: ");
            scanner.nextLine(); // Consumir el salto de línea
            Supervisor supervisor1 = new Supervisor(nombreSupervisor, cedulaSupervisor, sexoSupervisor, idSupervisor);

            // Ingresar datos del Arbitro
            System.out.print("Ingrese nombre del Arbitro: ");
            String nombreArbitro = scanner.nextLine();
            System.out.print("Ingrese cedula del Arbitro: ");
            String cedulaArbitro = scanner.nextLine();
            System.out.print("Ingrese sexo del Arbitro: ");
            String sexoArbitro = scanner.nextLine();
            int idArbitro = leerEntero(scanner, "Ingrese ID del Arbitro: ");
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Ingrese rol del Arbitro: ");
            String rolArbitro = scanner.nextLine();
            Arbitro arbitro1 = Arbitro.registrarArbitro(nombreArbitro, cedulaArbitro, sexoArbitro, idArbitro, rolArbitro, null);

            int numTitulares = 0;
            int numSuplentes = 0;
            boolean moreTeams = true;
            String equipoGanador = "";

            while (moreTeams) {
                // Ingresar datos del Equipo A
                System.out.print("Ingrese nombre del Equipo A: ");
                String nombreEquipoA = scanner.nextLine();
                System.out.print("Ingrese color del Equipo A: ");
                String colorEquipoA = scanner.nextLine();
                System.out.print("Ingrese entrenador del Equipo A: ");
                String entrenadorEquipoA = scanner.nextLine();
                System.out.print("Ingrese himno del Equipo A: ");
                String himnoEquipoA = scanner.nextLine();
                if (numTitulares == 0 && numSuplentes == 0) {
                    numTitulares = leerEntero(scanner, "Ingrese el numero de titulares del Equipo A: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    numSuplentes = leerEntero(scanner, "Ingrese el numero de suplentes del Equipo A: ");
                    scanner.nextLine(); // Consumir el salto de línea
                }
                System.out.println("Ingrese titulares del Equipo A:");
                List<Jugador> titularesEquipoA = ingresarJugadores(scanner, numTitulares);
                System.out.println("Ingrese suplentes del Equipo A:");
                List<Jugador> suplentesEquipoA = ingresarJugadores(scanner, numSuplentes);

                Equipo equipoA = new Equipo(nombreEquipoA, colorEquipoA, entrenadorEquipoA, himnoEquipoA, titularesEquipoA, suplentesEquipoA);
                equipos.add(equipoA);

                // Ingresar datos del Equipo B (mismo numero de jugadores y suplentes que Equipo A)
                System.out.print("Ingrese nombre del Equipo B: ");
                String nombreEquipoB = scanner.nextLine();
                System.out.print("Ingrese color del Equipo B: ");
                String colorEquipoB = scanner.nextLine();
                System.out.print("Ingrese entrenador del Equipo B: ");
                String entrenadorEquipoB = scanner.nextLine();
                System.out.print("Ingrese himno del Equipo B: ");
                String himnoEquipoB = scanner.nextLine();
                System.out.println("Ingrese titulares del Equipo B:");
                List<Jugador> titularesEquipoB = ingresarJugadores(scanner, numTitulares);
                System.out.println("Ingrese suplentes del Equipo B:");
                List<Jugador> suplentesEquipoB = ingresarJugadores(scanner, numSuplentes);

                Equipo equipoB = new Equipo(nombreEquipoB, colorEquipoB, entrenadorEquipoB, himnoEquipoB, titularesEquipoB, suplentesEquipoB);
                equipos.add(equipoB);

                // Ingresar informacion del partido
                System.out.print("Ingrese el equipo que gano (A, B, o empate): ");
                equipoGanador = scanner.nextLine().trim().toUpperCase();
                int campeonatos = 0;
                if (!equipoGanador.equals("EMPATE")) {
                    campeonatos = leerEntero(scanner, "Ingrese el numero de campeonatos (1-3): ");
                    while (campeonatos < 1 || campeonatos > 3) {
                        campeonatos = leerEntero(scanner, "Entrada invalida. Ingrese el numero de campeonatos (1-3): ");
                    }
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.println("Desea llenar los detalles del equipo ganador nuevamente? (si/no)");
                    String opcion = scanner.nextLine().trim().toLowerCase();
                    if (opcion.equals("si")) {
                        if (equipoGanador.equals("A")) {
                            equipos.remove(equipoA);
                            System.out.println("Llenando detalles del Equipo A nuevamente.");
                            // Reingresar datos del Equipo A
                            System.out.print("Ingrese nombre del Equipo A: ");
                            nombreEquipoA = scanner.nextLine();
                            System.out.print("Ingrese color del Equipo A: ");
                            colorEquipoA = scanner.nextLine();
                            System.out.print("Ingrese entrenador del Equipo A: ");
                            entrenadorEquipoA = scanner.nextLine();
                            System.out.print("Ingrese himno del Equipo A: ");
                            himnoEquipoA = scanner.nextLine();
                            System.out.println("Ingrese titulares del Equipo A:");
                            titularesEquipoA = ingresarJugadores(scanner, numTitulares);
                            System.out.println("Ingrese suplentes del Equipo A:");
                            suplentesEquipoA = ingresarJugadores(scanner, numSuplentes);

                            equipoA = new Equipo(nombreEquipoA, colorEquipoA, entrenadorEquipoA, himnoEquipoA, titularesEquipoA, suplentesEquipoA);
                            equipos.add(equipoA);
                        } else {
                            equipos.remove(equipoB);
                            System.out.println("Llenando detalles del Equipo B nuevamente.");
                            // Reingresar datos del Equipo B
                            System.out.print("Ingrese nombre del Equipo B: ");
                            nombreEquipoB = scanner.nextLine();
                            System.out.print("Ingrese color del Equipo B: ");
                            colorEquipoB = scanner.nextLine();
                            System.out.print("Ingrese entrenador del Equipo B: ");
                            entrenadorEquipoB = scanner.nextLine();
                            System.out.print("Ingrese himno del Equipo B: ");
                            himnoEquipoB = scanner.nextLine();
                            System.out.println("Ingrese titulares del Equipo B:");
                            titularesEquipoB = ingresarJugadores(scanner, numTitulares);
                            System.out.println("Ingrese suplentes del Equipo B:");
                            suplentesEquipoB = ingresarJugadores(scanner, numSuplentes);

                            equipoB = new Equipo(nombreEquipoB, colorEquipoB, entrenadorEquipoB, himnoEquipoB, titularesEquipoB, suplentesEquipoB);
                            equipos.add(equipoB);
                        }
                    }
                }

                System.out.println("Desea agregar mas equipos? (si/no)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (respuesta.equals("no")) {
                    moreTeams = false;
                }
            }

            // Mostrar la tabla de estadisticas
            System.out.println("\nDatos de los Equipos:");
            for (Equipo equipo : equipos) {
                mostrarDatosEquipo(equipo);
            }

            System.out.println("\nTotal de Faltas realizadas:");
            for (Equipo equipo : equipos) {
                int faltasTotales = equipo.calcularFaltasTotales();
                System.out.println(equipo.getNombre() + " - Faltas Totales: " + faltasTotales);
            }

            // Mostrar tabla de posiciones
            System.out.println("\nTabla de Posiciones:");
            for (Equipo equipo : equipos) {
                mostrarTablaPosiciones(equipo);
            }

            // Mostrar el equipo ganador en mayúsculas
            if (!equipoGanador.equals("EMPATE")) {
                System.out.println("\nEL EQUIPO GANADOR ES: " + equipoGanador);
            } else {
                System.out.println("\nEL PARTIDO TERMINO EN EMPATE");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static List<Jugador> ingresarJugadores(Scanner scanner, int cantidad) {
        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nombre del Jugador: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese cedula del Jugador: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese sexo del Jugador: ");
            String sexo = scanner.nextLine();
            System.out.print("Ingrese categoria del Jugador: ");
            String categoria = scanner.nextLine();
            int goles = leerEntero(scanner, "Ingrese goles del Jugador: ");
            scanner.nextLine(); // Consumir el salto de línea
            int faltas = leerEntero(scanner, "Ingrese faltas del Jugador: ");
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Ingrese posicion del Jugador: ");
            String posicion = scanner.nextLine();

            Jugador jugador = Jugador.registrarJugador(nombre, cedula, sexo, categoria, null, goles, faltas, posicion);
            jugadores.add(jugador);
        }
        return jugadores;
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada invalida. " + mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void mostrarDatosEquipo(Equipo equipo) {
        System.out.println("Nombre: " + equipo.getNombre());
        System.out.println("Color: " + equipo.getColor());
        System.out.println("Entrenador: " + equipo.getEntrenador());
        System.out.println("Himno: " + equipo.getHimno());
        System.out.println("Titulares:");
        for (Jugador jugador : equipo.getTitulares()) {
            mostrarDatosJugador(jugador);
        }
        System.out.println("Suplentes:");
        for (Jugador jugador : equipo.getSuplentes()) {
            mostrarDatosJugador(jugador);
        }
        System.out.println("Total goles: " + equipo.calcularGolesTotales());
        System.out.println("Total faltas: " + equipo.calcularFaltasTotales());
        System.out.println("Puntos: " + equipo.getPuntos());
    }

    private static void mostrarDatosJugador(Jugador jugador) {
        System.out.println("    Nombre: " + jugador.getNombre());
        System.out.println("    Cedula: " + jugador.getCedula());
        System.out.println("    Sexo: " + jugador.getSexo());
        System.out.println("    Categoria: " + jugador.getCategoria());
        System.out.println("    Goles: " + jugador.getGoles());
        System.out.println("    Faltas: " + jugador.getFaltas());
        System.out.println("    Posicion: " + jugador.getPosicion());
    }

    private static void mostrarTablaPosiciones(Equipo equipo) {
        System.out.println("Equipo: " + equipo.getNombre());
        System.out.println("Nombre | Goles | Faltas");
        for (Jugador jugador : equipo.getJugadores()) {
            System.out.printf("%s | %d | %d%n", jugador.getNombre(), jugador.getGoles(), jugador.getFaltas());
        }
        System.out.println("Estadisticas del Equipo:");
        System.out.println("Total Goles: " + equipo.getJugadores().stream().mapToInt(Jugador::getGoles).sum());
        System.out.println("Total Faltas: " + equipo.getJugadores().stream().mapToInt(Jugador::getFaltas).sum());
    }
}
