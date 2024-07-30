public class Director extends Persona {
    private int idDirector;

    public Director(String nombre, String cedula, String sexo, int idDirector) {
        super(nombre, cedula, sexo);
        this.idDirector = idDirector;
    }

  public void addDT() {
        System.out.println("Agregar Director Tecnico");
    }

    public void realizarCambios() {
        System.out.println("Realizar Cambios");
    }

    public void realizarFormacion() {
        System.out.println("Realizar Formacion");
    }
}
