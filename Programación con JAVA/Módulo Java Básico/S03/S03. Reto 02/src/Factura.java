import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto;
    private String descripción;
    private Optional<String> rfc;

    // Metodo público: Constructor
    public Factura(double monto, String descripción, String rfc) {
        this.monto = monto;
        this.descripción = descripción;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Metodo público: Devuelve una cadena con los datos de la factura
    public String getResumen() {
        String resumen = "\nFactura generada:\n";
        resumen += "Descripción: " + descripción + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si el RFC está presente, se muestra. Si no, se muestra un mensaje alternativo.
        resumen += "RFC: " + rfc.orElse( "[No proporcionado]") + "\n";

        return resumen;
    }
}
