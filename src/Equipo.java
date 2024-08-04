import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String colorUniforme;
    private String entrenador;
    private String himno;
    private List<Jugador> titulares;
    private List<Jugador> suplentes;
    private List<Jugador> jugadores; // Lista de jugadores

    public Equipo(String nombre, String colorUniforme, String entrenador, String himno, List<Jugador> titulares, List<Jugador> suplentes) {
        this.nombre = nombre;
        this.colorUniforme = colorUniforme;
        this.entrenador = entrenador;
        this.himno = himno;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.jugadores = new ArrayList<>(titulares);
        this.jugadores.addAll(suplentes);
    }

    public void definirEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Color del uniforme: " + colorUniforme);
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Himno: " + himno);
        System.out.println("Titulares:");
        for (Jugador jugador : titulares) {
            mostrarDatosJugador(jugador);
        }
        System.out.println("Suplentes:");
        for (Jugador jugador : suplentes) {
            mostrarDatosJugador(jugador);
        }
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        if (titulares.size() < 11) {
            titulares.add(jugador);
        } else {
            suplentes.add(jugador);
        }
    }

    public int calcularFaltasTotales() {
        int totalFaltas = 0;
        for (Jugador jugador : jugadores) {
            totalFaltas += jugador.getFaltas();
        }
        return totalFaltas;
    }

    public int calcularGolesTotales() {
        int totalGoles = 0;
        for (Jugador jugador : jugadores) {
            totalGoles += jugador.getGoles();
        }
        return totalGoles;
    }

    public String getColor() {
        return colorUniforme;
    }

    public int getPuntos() {
        int puntos = 0;
        for (Jugador jugador : jugadores) {
            // Supongamos que cada gol aporta 3 puntos y cada falta resta 1 punto
            puntos += jugador.getGoles() * 3 - jugador.getFaltas();
        }
        return puntos;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getHimno() {
        return himno;
    }

    public void setHimno(String himno) {
        this.himno = himno;
    }

    public List<Jugador> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<Jugador> titulares) {
        this.titulares = titulares;
    }

    public List<Jugador> getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(List<Jugador> suplentes) {
        this.suplentes = suplentes;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    private void mostrarDatosJugador(Jugador jugador) {
        System.out.println("    Nombre: " + jugador.getNombre());
        System.out.println("    Cédula: " + jugador.getCedula());
        System.out.println("    Sexo: " + jugador.getSexo());
        System.out.println("    Categoría: " + jugador.getCategoria());
        System.out.println("    Goles: " + jugador.getGoles());
        System.out.println("    Faltas: " + jugador.getFaltas());
        System.out.println("    Posición: " + jugador.getPosicion());
    }
}
