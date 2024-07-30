public class Cancha {
    private String ubicacion;
    private String nombre;
    private int tamano;

    public Cancha(String ubicacion, String nombre, int tamano) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.tamano = tamano;
    }

    // Getters
    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    // Setters
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Cancha{" +
                "ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}
