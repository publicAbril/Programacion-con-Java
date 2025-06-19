public class OrdenMasa extends OrdenProducción{

    public OrdenMasa(String codigo, int cantidad) {
        super(codigo, cantidad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🛠️ OrdenMasa - Código: " + getCódigo() + " - Cantidad: " + getCantidad());
    }
}
