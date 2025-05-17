public class Principal {
    public static void main(String[] args){
        Entrada entrada1 = new Entrada("ATEEZ 2025 WORLD TOUR [IN YOUR FANTASY]", 5880.50 );
        Entrada entrada2 = new Entrada("ENHYPEN WORLD TOUR 'WALK THE LYNE'", 9465.32);

        entrada1.mostrarInformación();
        entrada2.mostrarInformación();

        //Adicional: crear un registro extra usando record
        Entrada_Record entrada3 = new Entrada_Record( "Stray Kids dominATE World Tour", 6830.75);
        entrada3.mostrarInformación();
    }
}
