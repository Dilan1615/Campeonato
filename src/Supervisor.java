
import java.util.Scanner;

public class Supervisor extends Persona {
    private int idSupervisor;

    public Supervisor(String nombre, String cedula, String sexo, int idSupervisor) {
        super(nombre, cedula, sexo);
        this.idSupervisor = idSupervisor;
    }

    public static Supervisor register(Scanner scanner) {
        System.out.print("Ingrese nombre del Supervisor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese cédula del Supervisor: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese sexo del Supervisor: ");
        String sexo = scanner.nextLine();
        System.out.print("Ingrese ID del Supervisor: ");
        int idSupervisor = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        return new Supervisor(nombre, cedula, sexo, idSupervisor);
    }

    public void metodoEspecifico() {
        // Implementar método específico del Supervisor
        System.out.println("Método específico del Supervisor");
    }

    // Getters y Setters
    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
}
