public class SimuladorFarmacia {
    // Atributos
    String nombreMedicamento;
    double precioUnitario;
    int cantidad;
    double totalsindescuento;
    boolean aplicardescuento = true;
    double descuento;
    double totalcondescuento;

    public void mostrarInformación(){
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nMedicamento: " + nombreMedicamento);
        System.out.println("Cantidad de piezas: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalsindescuento);
        System.out.println("¿Aplicar descuento?: " + aplicardescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalcondescuento);
    }
}
