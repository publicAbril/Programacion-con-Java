import java.util.*;
import java.util.stream.*;

public class ConfirmaciónPedidos {

    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Lilia", "domicilio", "555-7184"),
                new Pedido("Airé", "local", null),
                new Pedido("Camila", "domicilio", null),
                new Pedido("Luisa", "domicilio", "555-8655")
        );

        // Almacenar los mensajes en una lista.
        List<String> mensajes = pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio"))
                .map(Pedido::getTeléfono)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(tel -> "📞 Confirmación enviada al número: " + tel)
                .toList();

        // Mostrar los mensajes.
        System.out.println("\n☎️ Confirmaciones de pedidos a domicilio: ");
        mensajes.forEach(System.out::println);
    }
}
