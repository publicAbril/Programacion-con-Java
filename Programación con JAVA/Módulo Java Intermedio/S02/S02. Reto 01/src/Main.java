import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n👩🏽‍🚀 Simulación de misión espacial iniciada...");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> nav = executor.submit(new SistemaNavegación());
        Future<String> vital = executor.submit(new SistemaSoporteVital());
        Future<String> com = executor.submit(new SistemaComunicaciones());
        Future<String> termico = executor.submit(new SistemaControlTérmico());

        System.out.println(nav.get());
        System.out.println(vital.get());
        System.out.println(com.get());
        System.out.println(termico.get());

        executor.shutdown();
        System.out.println("\n✓ Todos los sistemas reportan un estado operativo óptimo.");
    }
}