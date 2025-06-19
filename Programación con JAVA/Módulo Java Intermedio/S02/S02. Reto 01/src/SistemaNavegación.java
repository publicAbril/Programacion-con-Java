import java.util.concurrent.Callable;

public class SistemaNavegación implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "\n🛰️ Navegación: trayectoria corregida con éxito.";
    }
}