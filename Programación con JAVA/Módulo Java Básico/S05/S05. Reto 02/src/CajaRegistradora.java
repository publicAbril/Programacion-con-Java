public class CajaRegistradora {
    public static void main(String[] args) {
        MétodoPago[] pagos = {
                new PagoEfectivo(380.0),
                new PagoTarjeta(754.33, 2000.0),
                new PagoTransferencia(550.0, false)
        };
        for (MétodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("\nAutenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("\nError; autenticación fallida. " + pago.getClass().getSimpleName() + ": No válido.");
            }
            System.out.println();
        }
    }
}
