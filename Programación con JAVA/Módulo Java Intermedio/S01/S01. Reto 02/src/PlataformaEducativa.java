import java.util.*;
import java.util.function.Predicate;

public class PlataformaEducativa {

    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        System.out.println("\n📙 Materiales del curso: ");
        for (MaterialCurso material : lista) {
            material.mostrarDetalle();
        }
    }

    public static void contarDuraciónVideos(List<? extends Video> lista) {
        int total = 0;
        for (Video video : lista) {
            total += video.getDuración();
        }
        System.out.println("\n📼 Duración total de videos: " + total + " minutos.");
    }

    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        for (Object obj : lista) {
            if (obj instanceof Ejercicio) {
                Ejercicio ejercicio = (Ejercicio) obj;
                ejercicio.setRevisado(true);
                System.out.println("✓ Ejercicio '" + ejercicio.getTítulo() + "' marcado como revisado.");
            }
        }
        System.out.println();
    }
    // Desafío extra: Filtrar materiales por autor.
    public static void filtrarPorAutor(List<? extends MaterialCurso> lista, Predicate<MaterialCurso> filtro) {
        System.out.println("\n🔎 Filtrando materiales por autor: ");
        for (MaterialCurso material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }

    public static void main(String[] args) {
        // Crear materiales
        List<MaterialCurso> materiales = Arrays.asList(
                new Video("Introducción a Java", "Michael N.", 11),
                new Video("POO en Java", "Anna M.", 23),
                new Artículo("Historia de Java", "Anna M.", 1700),
                new Artículo("Tipos de datos", "Lourdes S.", 2800),
                new Ejercicio("Variables y tipos", "Anna M."),
                new Ejercicio("Condicionales", "Monserrat O.")
        );

        // Filtrar cada tipo (videos y ejercicios).
        List<Video> videos = new ArrayList<>();
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (MaterialCurso material : materiales) {
            if (material instanceof Video) {
                videos.add((Video) material);
            } else if (material instanceof Ejercicio) {
                ejercicios.add((Ejercicio) material);
            }
        }

        // Mostrar todos los materiales.
        mostrarMateriales(materiales);

        // Contar la duración total de videos.
        contarDuraciónVideos(videos);

        // Marcar ejercicios como revisados.
        marcarEjerciciosRevisados(ejercicios);

        // Código de desafío extra: Filtrar materiales por autor.
        filtrarPorAutor(materiales, material -> material.getAutor().equals("Anna M."));
    }
}