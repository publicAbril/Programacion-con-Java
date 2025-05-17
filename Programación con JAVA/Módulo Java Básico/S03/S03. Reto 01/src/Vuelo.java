public class Vuelo {
    // Atributos
    final String códigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String códigoVuelo, String destino, String horaSalida) {
        this.códigoVuelo = códigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }
    // Metodo con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }
    // Metodo con sobrecarga
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // Metodo sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }
    // Metodo que retorna un String
    public String obtenerItinerario() {
        String info = "Itinerario del vuelo:\n";
        info += "Código: " + códigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
