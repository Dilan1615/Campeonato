public class Deporte {
    private String nombre;
    private String lugar;
    private String tipo;

    public Deporte(String nombre, String lugar, String tipo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.tipo = tipo;
    }

    public static Deporte crearDeporte(String nombre, String tipo) {
        return new Deporte(nombre, null, tipo);
    }

    public void obtenerDeporte(int id) {
        // Implementación del método
    }

    // Getters y Setters
}
