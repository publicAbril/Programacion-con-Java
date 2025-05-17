public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(3880.74,"Servicio de consultoría","BEXS004173GX0");

        // Factura sin RFC (se usa null)
        Factura facturaSinRFC = new Factura(1900.0,"Reparación de equipo", null);

        // Imprimir el resumen de ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
