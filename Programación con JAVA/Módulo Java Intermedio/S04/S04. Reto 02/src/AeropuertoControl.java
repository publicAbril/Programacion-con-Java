import java.util.concurrent.*;
import java.util.Random;

public class AeropuertoControl {

    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Verificando condiciones para aterrizaje...\n");

        CompletableFuture<Boolean> pistaFuture = verificarPista();
        CompletableFuture<Boolean> climaFuture = verificarClima();
        CompletableFuture<Boolean> tráficoFuture = verificarTraficoAereo();
        CompletableFuture<Boolean> personalFuture = verificarPersonalTierra();

        CompletableFuture<Void> controlAterrizaje = CompletableFuture.allOf(pistaFuture, climaFuture, tráficoFuture, personalFuture)
                .thenAccept(v -> {
                    try {
                        boolean pista = pistaFuture.get();
                        boolean clima = climaFuture.get();
                        boolean tráfico = tráficoFuture.get();
                        boolean personal = personalFuture.get();

                        if (pista && clima && tráfico && personal) {
                            System.out.println("\n✅ Aterrizaje autorizado: todas las condiciones son óptimas.");
                        } else {
                            System.out.println("\n🚫 Aterrizaje denegado: las condiciones no son óptimas.");
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        System.out.println("\n🆘 Error en la evaluación de condiciones: " + e.getMessage());
                    }
                })
                .exceptionally(ex -> {
                    System.out.println("\n🆘 Error en el proceso de aterrizaje: " + ex.getMessage());
                    return null;
                });

        controlAterrizaje.join();
    }

    // Verificar disponibilidad de la pista (con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarPista() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🛬 Verificando pista...");
            dormir(2);
            boolean disponible = random.nextInt(100) < 80; // 80% de probabilidad de éxito
            System.out.println("🛬 Pista disponible: " + disponible);
            return disponible;
        });
    }

    // Verificar estado del clima (con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarClima() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🌦️ Verificando clima...");
            dormir(3);
            boolean bueno = random.nextInt(100) < 85; // 85% de probabilidad de éxito
            System.out.println("🌦️ Clima favorable: " + bueno);
            return bueno;
        });
    }

    // Verificar tráfico aéreo (con fallo aleatorio).
    public static CompletableFuture<Boolean> verificarTraficoAereo() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🚦 Verificando tráfico aéreo...");
            dormir(1);
            boolean libre = random.nextInt(100) < 90; // 90% de probabilidad de éxito
            System.out.println("🚦 Tráfico aéreo despejado: " + libre);
            return libre;
        });
    }

    // Verificar personal en tierra (con fallo aleatorio).
    public static CompletableFuture<Boolean> verificarPersonalTierra() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("👷‍ Verificando personal en tierra...");
            dormir(2);
            boolean disponible = random.nextInt(100) < 95; // 95% de probabilidad de éxito
            System.out.println("👷‍ Personal disponible: " + disponible);
            return disponible;
        });
    }

    // Auxiliar para simular latencia.
    public static void dormir(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
