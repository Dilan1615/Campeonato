
public class Persona {
    private String nombre;
    private String cedula;
    private String sexo;

    public Persona(String nombre, String cedula, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public void obtenerDatos() {
        System.out.println("Nombre: " + nombre + ", Cedula: " + cedula + ", Sexo: " + sexo);
    }

    // Getters y Setters
}

