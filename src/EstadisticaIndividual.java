public class EstadisticaIndividual {
    private Jugador jugador;
    private String goles;
    private String asistencias;

    public EstadisticaIndividual(Jugador jugador, String goles, String asistencias) {
        this.jugador = jugador;
        this.goles = goles;
        this.asistencias = asistencias;
    }

    // Getters
    public Jugador getJugador() {
        return jugador;
    }

    public String getGoles() {
        return goles;
    }

    public String getAsistencias() {
        return asistencias;
    }

    // Setters
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

    public void setAsistencias(String asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "EstadisticaIndividual{" +
                "jugador=" + jugador +
                ", goles='" + goles + '\'' +
                ", asistencias='" + asistencias + '\'' +
                '}';
    }
}
