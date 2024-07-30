public class Jugador extends Persona {
    private String categoria;
    private byte[] foto;

    public Jugador(String nombre, String cedula, String sexo, String categoria, byte[] foto) {
        super(nombre, cedula, sexo);
        this.categoria = categoria;
        this.foto = foto;
    }

    public static Jugador registrarJugador(String nombre, String cedula, String sexo, String categoria, byte[] foto) {
        return new Jugador(nombre, cedula, sexo, categoria, foto);
    }

    public void obtenerJugador() {
        obtenerDatos();
        System.out.println("Categoria: " + categoria);
    }

    // Getters y Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    private void obtenerDatos() {
        // Implementar lógica para obtener datos del jugador si es necesario
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Sexo: " + getSexo());
    }
}
