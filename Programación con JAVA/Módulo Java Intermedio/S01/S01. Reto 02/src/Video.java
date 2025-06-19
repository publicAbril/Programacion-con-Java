public class Video extends MaterialCurso {

    private final int duración; // en minutos

    public Video(String título, String autor, int duración) {
        super(título, autor);
        this.duración = duración;
    }

    public int getDuración() {return duración;}

    @Override
    public void mostrarDetalle() {
        System.out.println("📼 Video: " + getTítulo() + " - Autor: " + getAutor() + " - Duración: " + duración + " min.");
    }
}
