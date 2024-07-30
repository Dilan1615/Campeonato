public class Amonestacion {
    private String motivo;
    private int idAmonestacion;

    public Amonestacion(String motivo, int idAmonestacion) {
        this.motivo = motivo;
        this.idAmonestacion = idAmonestacion;
    }

    // Getters
    public String getMotivo() {
        return motivo;
    }

    public int getIdAmonestacion() {
        return idAmonestacion;
    }

    // Setters
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setIdAmonestacion(int idAmonestacion) {
        this.idAmonestacion = idAmonestacion;
    }

    @Override
    public String toString() {
        return "Amonestacion{" +
                "motivo='" + motivo + '\'' +
                ", idAmonestacion=" + idAmonestacion +
                '}';
    }

    // Puedes agregar métodos adicionales según lo necesites
    public boolean esGrave() {
        // Suponiendo que las amonestaciones con id superior a 100 son graves
        return this.idAmonestacion > 100;
    }
}
