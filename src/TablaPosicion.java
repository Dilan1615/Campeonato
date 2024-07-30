public class TablaPosicion {
    private int posicion;
    private int id;

    public TablaPosicion(int posicion, int id) {
        this.posicion = posicion;
        this.id = id;
    }

    public void ordenarEstadisticas() {
        System.out.println("Ordenar Estadisticas");
    }

    public void crearTabla() {
        System.out.println("Crear Tabla");
    }

    // Getters y Setters
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
