import java.util.Date;
import java.util.List;

public class Inscripcion {
    private String deporte;
    private String NCI;
    private int numParticipantes;
    private Date fecha;
    private String estado;

    public Inscripcion(String deporte, String NCI, int numParticipantes, Date fecha, String estado) {
        this.deporte = deporte;
        this.NCI = NCI;
        this.numParticipantes = numParticipantes;
        this.fecha = fecha;
        this.estado = estado;
    }

    public static Inscripcion registrarInscripcion(Jugador jugador, Campeonato campeonato) {
        // Implementación de ejemplo
        return new Inscripcion("Futbol", "12345", 11, new Date(), "Registrado");
    }

    public List<Inscripcion> obtenerInscripcion(Jugador jugador) {
        // Implementación de ejemplo
        return List.of(new Inscripcion("Futbol", "12345", 11, new Date(), "Registrado"));
    }

    // Getters y Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNCI() {
        return NCI;
    }

    public void setNCI(String NCI) {
        this.NCI = NCI;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
