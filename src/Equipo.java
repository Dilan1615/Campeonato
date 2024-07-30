import java.util.List;

public class Equipo {
    private String nombre;
    private String colorUniforme;
    private String entrenador;
    private String himno;
    private List<String> titulares;
    private List<String> suplentes;

    public Equipo(String nombre, String colorUniforme, String entrenador, String himno, List<String> titulares, List<String> suplentes) {
        this.nombre = nombre;
        this.colorUniforme = colorUniforme;
        this.entrenador = entrenador;
        this.himno = himno;
        this.titulares = titulares;
        this.suplentes = suplentes;
    }

    public void definirEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Color del uniforme: " + colorUniforme);
        System.out.println("Entrenador: " + entrenador);       
        System.out.println("Titulares: " + titulares);
        System.out.println("Suplentes: " + suplentes);
    }

    // Getters y Setters
}
