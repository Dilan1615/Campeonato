public class Jugador extends Persona {
    private String posicion;
    private int goles;
    private int asistencias;
    private int faltas;

    public Jugador(String nombre, String cedula, String sexo, String categoria, int id) {
        super(nombre, cedula, sexo);
        // Otros inicializadores si es necesario
    }

    public static Jugador registrarJugador(String nombre, String cedula, String sexo, String categoria, Campeonato campeonato) {
        // Implementación del método
        return new Jugador(nombre, cedula, sexo, categoria, 1);
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getGoles() {
        return goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public int getFaltas() {
        return faltas;
    }
    
    // Otros métodos si es necesario
}
