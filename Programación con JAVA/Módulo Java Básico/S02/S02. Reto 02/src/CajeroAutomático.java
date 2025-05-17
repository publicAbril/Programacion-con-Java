import java.util.Scanner;

public class CajeroAutomático {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        var saldo = 1000.0;
        int opción;

        do {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Bienvenido(a) al cajero automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retiro de dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opción = input.nextInt();

            switch (opción) {
                case 1 -> {
                    // Opción 1. Consultar saldo
                    System.out.println("Saldo disponible: $" + saldo);
                }
                case 2 -> {
                    //Opción 2. Depositar dinero
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = input.nextDouble();

                    if (deposito <= 0){
                        //Validación del monto a depositar
                        System.out.println("Error de transacción; el monto debe ser mayor a 0.");
                        continue;
                    }

                    saldo += deposito;
                    System.out.println("Depósito realizado exitosamente. Saldo actual: $" + saldo);
                }
                case 3 -> {
                    // Opción 3. Retirar dinero
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = input.nextDouble();

                    if (retiro <= 0) {
                        //Validación
                        System.out.println("Error de transacción; el monto debe ser mayor a 0.");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println("Error de transacción; su saldo es insuficiente. Su saldo disponible es: $" + saldo);

                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado exitosamente. Saldo actual: $" + saldo);
                    }
                }
                case 4 -> {
                    // Opción 4. Salir
                    System.out.println("Gracias por utilizar nuestro cajero.¡Vuelva pronto!");
                }
                default -> {
                    // Opción no válida
                    System.out.println("Opción no válida. Intenta nuevamente");
                }
            }

        } while (opción != 4);

        input.close(); // Siempre cerrar el Scanner
    }
}
