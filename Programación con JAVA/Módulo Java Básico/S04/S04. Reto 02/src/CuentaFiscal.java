import java.util.Objects;

public class CuentaFiscal {
    // Atributos
    private final String RFC;// No modificable
    private double saldoDisponible;

    // Constructor con validación del saldo.
    public CuentaFiscal(String RFC, double saldoDisponible) {
        this.RFC = RFC;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("Error; el saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }
    // Getters de ambos atributos
    public String getRFC(){return RFC;}
    public double getSaldoDisponible(){return saldoDisponible;}

    // Metodo que valida si el RFC de la cuenta coincide con el de la declaración.
    public boolean validarRFC(DeclaracionImpuestos d){return Objects.equals(this.RFC, d.rfcContribuyente());}

    // Metodo para mostrar la información de cuenta.
    public void mostrarInformación() {
        System.out.println("Cuenta fiscal registrada con RFC: " + RFC + ", saldo disponible: $" + saldoDisponible);
    }
}
