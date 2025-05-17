public class PagoTransferencia extends MétodoPago {
    private boolean validaciónExterna;

    public PagoTransferencia(double monto, boolean validaciónExterna) {
        super(monto);
        this.validaciónExterna = validaciónExterna;
    }
    @Override
    public boolean autenticar() {
        return validaciónExterna;
    }
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por: $" + monto);
    }
}
