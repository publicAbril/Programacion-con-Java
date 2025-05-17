public class Main {
    public static void main (String [] args) {
        // Crear una declaración de impuestos.
        DeclaracionImpuestos declaración = new DeclaracionImpuestos("EMAS998117GX0",9867.31);

        // Crear una cuenta fiscal.
        CuentaFiscal cuenta = new CuentaFiscal("EMAS998117GX0",10000.0);

        // Mostrar la información de ambas.
        System.out.println("\nDeclaración enviada por RFC: " + declaración.rfcContribuyente() + " por $" + declaración.montoDeclarado());
        cuenta.mostrarInformación();

        // Validación del RFC.
        boolean rfcValido = cuenta.validarRFC(declaración);
        System.out.println("\n¿RFC válido para esta cuenta?: " + rfcValido);
    }
}