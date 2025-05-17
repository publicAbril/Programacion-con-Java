public class Factura {
    // Atributos
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    // Metodo toString() para mostrar la información de la factura de forma legible.
    @Override
    public String toString() {
        return "Factura [folio= " + folio + ", cliente= " + cliente + ", total= $" + total + "]";
    }
    // Metodo equals() para comparar si dos facturas tienen el mismo folio.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Se compara solo el folio
    }
    // Metodo hashCode() basado en el atributo folio.
    @Override
    public int hashCode() {return folio.hashCode();}
}
