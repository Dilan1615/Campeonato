public class Arbitro extends Persona {
    private int idArbitro;
    private String categoria;
    private byte[] foto;

    public Arbitro(String nombre, String cedula, String sexo, int idArbitro, String categoria, byte[] foto) {
        super(nombre, cedula, sexo);
        this.idArbitro = idArbitro;
        this.categoria = categoria;
        this.foto = foto;
    }

    public static Arbitro registrarArbitro(String nombre, String cedula, String sexo, int idArbitro, String categoria, byte[] foto) {
        return new Arbitro(nombre, cedula, sexo, idArbitro, categoria, foto);
    }

    public void obtenerArbitro() {
        obtenerDatos();
        System.out.println("Categoría: " + categoria);
    }

    // Getters y Setters
}
