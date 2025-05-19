import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RegistroMuestrasGenéticas {
    public static void main(String[] args) {

        // Paso 1: ArrayList<String> para registrar el orden en que llegaron las muestras.
        ArrayList<String> muestras = new ArrayList<>();

        // Registro de muestras
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden: ");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }
        // Paso 2: HashSet<String> para obtener una lista de especies únicas.
        HashSet<String> especiesÚnicas = new HashSet<>(muestras);

        System.out.println("\nEspecies únicas procesadas: ");
        for (String especie : especiesÚnicas) {
            System.out.println("- " + especie);
        }
        // Paso 3: HashMap<String, String> para asociar el ID de muestra con el nombre del investigador.
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // Asociar el ID de muestra con el nombre del investigador.
        muestrasInvestigador.put("M-001", "Dr. Pycelle");
        muestrasInvestigador.put("M-002", "Dra. Targaryen");
        muestrasInvestigador.put("M-003", "Dra. Tyrell");

        System.out.println("\nAsignación de muestras a investigadores: ");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Paso 4: Mostrar búsqueda de investigador por ID de muestra
        String idBuscar = "M-003";
        System.out.println("\nInvestigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}
