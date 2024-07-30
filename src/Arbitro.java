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

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
    }

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
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Sexo: " + getSexo());
        System.out.println("ID Arbitro: " + idArbitro);
    }
}
