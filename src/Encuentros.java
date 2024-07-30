import java.util.List;

public class Encuentros {
    private List<Registro> encuentros;

    public Encuentros(List<Registro> encuentros) {
        this.encuentros = encuentros;
    }

    public void realizarEncuentro() {
        System.out.println("Realizar Encuentro");
    }

    // Getters
    public List<Registro> getEncuentros() {
        return encuentros;
    }

    // Setters
    public void setEncuentros(List<Registro> encuentros) {
        this.encuentros = encuentros;
    }
}
