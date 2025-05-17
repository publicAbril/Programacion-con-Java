public record Entrada_Record(String nombreEvento, double precioEvento) {
    public void mostrarInformación(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEvento);
    }
}
