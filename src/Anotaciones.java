public class Anotaciones {
    private int puntos;
    private int idAnotacion;

    public Anotaciones(int puntos, int idAnotacion) {
        this.puntos = puntos;
        this.idAnotacion = idAnotacion;
    }

    public void registrarAnotaciones() {
        System.out.println("Registrar Anotaciones");
    }

    // Getters
    public int getPuntos() {
        return puntos;
    }

    public int getIdAnotacion() {
        return idAnotacion;
    }

    // Setters
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setIdAnotacion(int idAnotacion) {
        this.idAnotacion = idAnotacion;
    }
}
