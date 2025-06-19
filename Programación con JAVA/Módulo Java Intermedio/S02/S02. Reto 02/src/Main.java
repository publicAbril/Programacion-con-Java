import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n🏥 Iniciando simulación de acceso al recurso...");

        RecursoMédico salaCirugia = new RecursoMédico("Sala de cirugía");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new Profesional("Dra. Ramos", salaCirugia));
        executor.submit(new Profesional("Dra. Silva", salaCirugia));
        executor.submit(new Profesional("Enfermera Torres", salaCirugia));
        executor.submit(new Profesional("Dra. Teran", salaCirugia));

        executor.shutdown();
    }
}