import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {
    private int id;
    private String nombre;
    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Equipo> equipos;
    private String equipoGanador;

    // Constructor con todos los parámetros necesarios
    public Campeonato(int id, String nombre, String tipo, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.equipos = new ArrayList<>();
    }

    // Método estático para crear una instancia de Campeonato
    public static Campeonato crearCampeonato(int id, String nombre, String tipo, Date fechaInicio, Date fechaFin) {
        return new Campeonato(id, nombre, tipo, fechaInicio, fechaFin);
    }

    // Métodos para agregar y obtener equipos
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    // Métodos para establecer y obtener el equipo ganador
    public void setGanador(String equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public String getGanador() {
        return equipoGanador;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
