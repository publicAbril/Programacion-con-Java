public class OrdenPrototipo extends OrdenProducción{

    private final String faseDesarrollo;

    public OrdenPrototipo(String código, int cantidad, String faseDesarrollo) {
        super(código, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    public String getFaseDesarrollo() { return faseDesarrollo; }

    @Override
    public void mostrarResumen() {
        System.out.println("🔩 OrdenPrototipo - Código: " + getCódigo() + " - Cantidad: " + getCantidad() + " - Fase: " + faseDesarrollo);
    }
}
