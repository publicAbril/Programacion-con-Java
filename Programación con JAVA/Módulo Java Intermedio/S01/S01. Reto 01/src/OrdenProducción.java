public abstract class OrdenProducción {

    private final String código;
    private final int cantidad;

    public OrdenProducción(String código, int cantidad) {
        this.código = código;
        this.cantidad = cantidad;
    }

    public String getCódigo() {return código;}
    public int getCantidad() {return cantidad;}

    public abstract void mostrarResumen();
}
