import java.util.*;

public class ProcesadorEncuestas {

    public static void main(String[] args) {

        List<Sucursal> sucursales = List.of(
                new Sucursal(" Centro", List.of(
                        new Encuesta("Anna", "El tiempo de espera fue largo", 3),
                        new Encuesta("Alina", null, 5)
                )),
                new Sucursal(" Norte", List.of(
                        new Encuesta("Mariana", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new Encuesta("Perla", null, 3)
                )),
                new Sucursal(" Este", List.of(
                        new Encuesta("Charly", null, 2),
                        new Encuesta("Sergio", "No encontré el medicamento que necesitaba", 2)
                ))
        );

        System.out.println("\nSeguimiento a pacientes insatisfechos:");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3)
                                .map(encuesta -> new Seguimiento(encuesta, sucursal.getNombre()))
                )
                .filter(seg -> seg.encuesta().getComentario().isPresent())
                .map(seg -> {
                    String comentario = seg.encuesta().getComentario().get();
                    return "🏥 Sucursal " + seg.sucursal() +
                            ": Seguimiento a paciente con comentario: \"" + comentario + "\"." ;
                })
                .forEach(System.out::println);
    }

    // Clase auxiliar para transportar Encuesta + Sucursal juntos, tipo record.
    record Seguimiento(Encuesta encuesta, String sucursal) {
    }
}