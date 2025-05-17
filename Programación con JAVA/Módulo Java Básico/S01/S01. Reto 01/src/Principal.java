import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        // Solicitud del nombre
        System.out.print("\nIngrese el nombre del paciente: ");
        paciente1.nombre = input.nextLine();

        // Solicitud de la edad
        System.out.print("Ingrese la edad del paciente: ");
        paciente1.edad = input.nextInt();
        input.nextLine();

        // Solicitud del número de expediente
        System.out.print("Ingrese el no. de expediente: ");
        paciente1.no_Expediente = input.nextLine();

        input.close();

        paciente1.mostrarInformación();
    }
}
