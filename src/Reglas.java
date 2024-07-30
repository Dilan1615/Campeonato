public class Reglas {
    private int numReglas;
    private String tipo;

    public Reglas(int numReglas, String tipo) {
        this.numReglas = numReglas;
        this.tipo = tipo;
    }

    // Métodos específicos de Reglas
    public int getNumReglas() {
        return numReglas;
    }

    public void setNumReglas(int numReglas) {
        this.numReglas = numReglas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
