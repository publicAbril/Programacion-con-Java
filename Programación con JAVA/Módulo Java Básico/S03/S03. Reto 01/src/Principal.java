public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Abril Hernández", "D93758622");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("VCS9863", "Seúl, Corea del Sur", "19:40");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("\n¡Reserva finalizada con éxito!\n");
        } else {
            System.out.println("Error; la reserva no pudo ser procesada.");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reservación
        vuelo.reservarAsiento("Anya Bernal", "E84956479");
        System.out.println(vuelo.obtenerItinerario());
    }
}
