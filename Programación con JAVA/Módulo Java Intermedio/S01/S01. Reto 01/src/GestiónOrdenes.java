import java.util.*;

public class GestiónOrdenes {

    public static void mostrarOrdenes(List<? extends OrdenProducción> lista) {
        System.out.println("\n📌 Órdenes registradas:");
        for (OrdenProducción orden : lista) {
            orden.mostrarResumen();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional) {
        System.out.println("\n🕓 Procesando órdenes personalizadas...");
        for (Object obj : lista) {
            if (obj instanceof OrdenPersonalizada) {
                OrdenPersonalizada op = (OrdenPersonalizada) obj;
                System.out.println("✅ Orden " + op.getCódigo() + " ajustada con costo adicional de $ " + costoAdicional);
            }
        }
    }

    // Desafío extra: Contar órdenes por tipo.
    public static void contarOrdenes(List<? extends OrdenProducción> lista) {
        long masas = lista.stream().filter(o -> o instanceof OrdenMasa).count();
        long personalizadas = lista.stream().filter(o -> o instanceof OrdenPersonalizada).count();
        long prototipos = lista.stream().filter(o -> o instanceof OrdenPrototipo).count();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("\n📋 Resumen total de órdenes:");
        System.out.println("🛠️ Producción en masa: " + masas);
        System.out.println("🗳️ Personalizadas: " + personalizadas);
        System.out.println("🔩 Prototipos: " + prototipos);
    }

    public static void main(String[] args) {
        List<OrdenProducción> todasLasOrdenes = new ArrayList<>();

        List<OrdenMasa> masas = Arrays.asList(
                new OrdenMasa("A001", 527),
                new OrdenMasa("A002", 750)
        );

        List<OrdenPersonalizada> personalizadas = Arrays.asList(
                new OrdenPersonalizada("P001", 103, "ClienteX"),
                new OrdenPersonalizada("P002", 188, "ClienteY")
        );

        List<OrdenPrototipo> prototipos = Arrays.asList(
                new OrdenPrototipo("T001", 11, "Diseño"),
                new OrdenPrototipo("T002", 15, "Pruebas")
        );

        // Agregar todas las órdenes a la lista combinada.
        todasLasOrdenes.addAll(masas);
        todasLasOrdenes.addAll(personalizadas);
        todasLasOrdenes.addAll(prototipos);

        // Mostrar órdenes por tipo.
        mostrarOrdenes(masas);
        mostrarOrdenes(personalizadas);
        mostrarOrdenes(prototipos);

        // Procesar órdenes personalizadas.
        procesarPersonalizadas(personalizadas, 200);

        // Código del desafío extra: contar órdenes por tipo.
        contarOrdenes(todasLasOrdenes);
    }
}
