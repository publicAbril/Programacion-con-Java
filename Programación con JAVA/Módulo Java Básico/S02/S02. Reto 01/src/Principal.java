import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SimuladorFarmacia medicamento1 = new SimuladorFarmacia();

        //Solicitud del nombre del medicamento
        System.out.print("Ingrese el nombre del medicamento: ");
        medicamento1.nombreMedicamento = input.nextLine();

        //Solicitud de la cantidad de piezas
        System.out.print("Ingrese la cantidad demandada: ");
        medicamento1.cantidad = input.nextInt();

        //Solicitud del precio unitario
        System.out.print("Ingrese el precio unitario: $");
        medicamento1.precioUnitario = input.nextDouble();

        //Calcular total sin descuento
        medicamento1.totalsindescuento = medicamento1.precioUnitario * medicamento1.cantidad;

        //Calcular el descuento si el total es mayor a $500
        medicamento1.aplicardescuento = medicamento1.totalsindescuento > 500;

        //Asignación del 15% de descuento
        medicamento1.descuento = medicamento1.aplicardescuento ? medicamento1.totalsindescuento * 0.15: 0;

        //Calcular el total a pagar
        medicamento1.totalcondescuento = medicamento1.totalsindescuento - medicamento1.descuento;

        medicamento1.mostrarInformación();
    }
}
