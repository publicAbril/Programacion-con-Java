public class Entrada {
    // Atributos
    String nombreEvento;
    double precioEntrada;

    // Constructor
    public Entrada(String nombreEvento, double precioEntrada){
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    public void mostrarInformación(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}
