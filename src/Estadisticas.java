public class Estadisticas {
    private int puntosVictoria;
    private int id;
    private int puntosDerrota;
    private int sumatoria;
    private int idEstadistico;

    public Estadisticas(int puntosVictoria, int id, int puntosDerrota, int sumatoria, int idEstadistico) {
        this.puntosVictoria = puntosVictoria;
        this.id = id;
        this.puntosDerrota = puntosDerrota;
        this.sumatoria = sumatoria;
        this.idEstadistico = idEstadistico;
    }

    public void generarEstadistico() {
        System.out.println("Generar Estadistico");
    }

    // Getters
    public int getPuntosVictoria() {
        return puntosVictoria;
    }

    public int getId() {
        return id;
    }

    public int getPuntosDerrota() {
        return puntosDerrota;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public int getIdEstadistico() {
        return idEstadistico;
    }

    // Setters
    public void setPuntosVictoria(int puntosVictoria) {
        this.puntosVictoria = puntosVictoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPuntosDerrota(int puntosDerrota) {
        this.puntosDerrota = puntosDerrota;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public void setIdEstadistico(int idEstadistico) {
        this.idEstadistico = idEstadistico;
    }
}
    