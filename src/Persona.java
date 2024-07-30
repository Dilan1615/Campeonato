
public class Persona {
    private String nombre;
    private String cedula;
    private String sexo;

    public Persona(String nombre, String cedula, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }
}
