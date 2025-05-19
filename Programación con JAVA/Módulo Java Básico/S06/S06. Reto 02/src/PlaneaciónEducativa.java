import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Paso 1: Definir la clase Tema e implementar Comparable para ordenar por título.
class Tema implements Comparable<Tema> {
    String título;
    int prioridad;

    public Tema(String título, int prioridad) {
        this.título = título;
        this.prioridad = prioridad;
    }
    @Override
    public int compareTo(Tema otro) {return this.título.compareTo(otro.título);}

    @Override
    public String toString() {return "Tema: " + título + " | Prioridad: " + prioridad;}
}

public class PlaneaciónEducativa {
    public static void main(String[] args) {

        // Paso 2: Crear una lista de temas usando CopyOnWriteArrayList
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Comprensión Lectora", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Geografía", 3));

        // Paso 3: Ordenar los temas alfabéticamente usando Comparable.
        Collections.sort(temas);
        System.out.println("\nTemas ordenados alfabéticamente: ");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 4: Ordenar los temas por prioridad usando Comparator.
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\nTemas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 5: Crear un repositorio usando ConcurrentHashMap.
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Comprensión Lectora", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/matematicas");
        recursos.put("Geografia", "https://recursos.edu/geografia");

        // Paso 6: Mostrar el repositorio de recursos.
        System.out.println("\nRepositorio de recursos por tema: ");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " -> " + recursos.get(tema));
        }
    }
}
