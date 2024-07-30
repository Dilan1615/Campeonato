public class EstadisticaGrupal {
    private String equipo;

    public EstadisticaGrupal(String equipo) {
        this.equipo = equipo;
    }

    // Getters
    public String getEquipo() {
        return equipo;
    }

    // Setters
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "EstadisticaGrupal{" +
                "equipo='" + equipo + '\'' +
                '}';
    }
}
