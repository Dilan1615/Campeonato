public class Registro {
    private String nombre;
    private int idRegistro;

    public Registro(String nombre, int idRegistro) {
        this.nombre = nombre;
        this.idRegistro = idRegistro;
    }

    public void realizarRegistro() {
        System.out.println("Realizar Registro");
    }

    public void registrarEncuentro() {
        System.out.println("Registrar Encuentro");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
}