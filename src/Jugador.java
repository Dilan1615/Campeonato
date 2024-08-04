public class Jugador extends Persona {

    private String categoria;
    private byte[] foto;
    private int goles;
    private int faltas;
    private String posicion;

    // Constructor
    public Jugador(String nombre, String cedula, String sexo, String categoria, byte[] foto, int goles, int faltas, String posicion) {
        super(nombre, cedula, sexo);
        this.categoria = categoria;
        this.foto = foto;
        this.goles = goles;
        this.faltas = faltas;
        this.posicion = posicion;
    }

    // Método estático para registrar un jugador
    public static Jugador registrarJugador(String nombre, String cedula, String sexo, String categoria, byte[] foto, int goles, int faltas, String posicion) {
        return new Jugador(nombre, cedula, sexo, categoria, foto, goles, faltas, posicion);
    }

    // Mostrar información del jugador
    public void obtenerJugador() {
        obtenerDatos();
        System.out.println("Categoria: " + categoria);
        System.out.println("Goles: " + goles);
        System.out.println("Faltas: " + faltas);
        System.out.println("Posición: " + posicion);
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

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    private void obtenerDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Sexo: " + getSexo());
    }
}
