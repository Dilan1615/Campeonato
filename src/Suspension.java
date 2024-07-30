public class Suspension {
    private String motivo;
    private String tipo;
    private String tiempoSuspension;

    public Suspension(String motivo, String tipo, String tiempoSuspension) {
        this.motivo = motivo;
        this.tipo = tipo;
        this.tiempoSuspension = tiempoSuspension;
    }

    // Métodos específicos de Suspension
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTiempoSuspension() {
        return tiempoSuspension;
    }

    public void setTiempoSuspension(String tiempoSuspension) {
        this.tiempoSuspension = tiempoSuspension;
    }
}
