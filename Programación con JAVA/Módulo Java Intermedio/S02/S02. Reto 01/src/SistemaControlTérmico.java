import java.util.concurrent.Callable;

public class SistemaControlTérmico implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1100);
        return "🌡️ Control térmico: temperatura estable (18°C).";
    }
}