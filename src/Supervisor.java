public class Supervisor extends Persona {
    private int idSupervisor;

    public Supervisor(String nombre, String cedula, String sexo, int idSupervisor) {
        super(nombre, cedula, sexo);
        this.idSupervisor = idSupervisor;
    }

    public void metodoEspecifico() {
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
