public class Main {
    public static void main(String[] args) {
        // Crear dos facturas con el mismo folio.
        Factura F1 = new Factura("FAC0001", "Abril Hernández", 1700.00);
        Factura F2 = new Factura("FAC0001", "Sebastián Marín", 3884.73);

        // Mostrar ambas facturas con toString().
        System.out.println(F1);
        System.out.println(F2);

        // Comparar si son iguales con equals().
        System.out.println("\n¿Las facturas son iguales?: " + F1.equals(F2));
    }
}