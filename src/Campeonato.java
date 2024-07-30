import java.util.Date;

public class Campeonato {
    private int id;
    private String nombre;
    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;

    public Campeonato(int id, String nombre, String tipo, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public static Campeonato crearCampeonato(String nombre, String tipo, Date fechaInicio, Date fechaFin) {
        return new Campeonato(0, nombre, tipo, fechaInicio, fechaFin);
    }

    public Campeonato obtenerCampeonato(int id) {
        // Implementación del método
        return null;
    }

    // Getters y Setters
}
