public class Paciente {

    // Atributos
    String nombre;
    int edad;
    String no_Expediente;

    // Métodos
    public void mostrarInformación(){
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Información del paciente");
        System.out.println("Paciente:"+ nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Expediente:" + no_Expediente);
    }
}
