import java.util.Optional;

public class Encuesta {
    private final String paciente;
    private final String comentario;
    private final int calificación; // Valor del 1 al 5

    public Encuesta(String paciente, String comentario, int calificación) {
        this.paciente = paciente;
        this.comentario = comentario;
        this.calificación = calificación;
    }

    public int getCalificacion() { return calificación; }

    // Obtener el comentario como Optional.
    public Optional<String> getComentario() {
        return Optional.ofNullable(comentario);
    }
}
