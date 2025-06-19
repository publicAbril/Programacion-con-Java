import java.util.Optional;

public class Pedido {

    private final String cliente;
    private final String tipoEntrega;
    private final String teléfono;

    public Pedido(String cliente, String tipoEntrega, String teléfono) {
        this.cliente = cliente;
        this.tipoEntrega = tipoEntrega;
        this.teléfono = teléfono;
    }

    public String getCliente() {return cliente;}
    public String getTipoEntrega() {return tipoEntrega;}

    // Obtener el teléfono como Optional.
    public Optional<String> getTeléfono() {return Optional.ofNullable(teléfono);
    }
}