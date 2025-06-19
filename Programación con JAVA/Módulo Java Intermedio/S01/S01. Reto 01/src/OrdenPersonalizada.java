public class OrdenPersonalizada extends OrdenProducción{

    private final String cliente;

    public OrdenPersonalizada(String codigo, int cantidad, String cliente) {
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    public String getCliente() { return cliente; }

    @Override
    public void mostrarResumen() {
        System.out.println("🗳️ OrdenPersonalizada - Código: " + getCódigo() + " - Cantidad: " + getCantidad() + " - Cliente: " + cliente);
    }
}
