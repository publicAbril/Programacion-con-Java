public class Profesional implements Runnable {

    private final String nombre;
    private final RecursoMédico recurso;

    public Profesional(String nombre, RecursoMédico recurso) {
        this.nombre = nombre;
        this.recurso = recurso;
    }

    @Override
    public void run() {
        recurso.usar(nombre);
    }
}