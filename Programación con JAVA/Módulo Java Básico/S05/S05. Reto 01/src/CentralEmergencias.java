public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia","Marian Mendoza");
        Patrulla patrulla = new Patrulla("Patrulla","Alina Lemus");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos","Carolina Sosa");

        ambulancia.iniciarOperación();
        System.out.println();

        patrulla.iniciarOperación();
        System.out.println();

        bomberos.iniciarOperación();
    }
}
