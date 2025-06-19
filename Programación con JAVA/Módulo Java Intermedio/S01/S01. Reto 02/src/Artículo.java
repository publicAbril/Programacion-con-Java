public class Artículo extends MaterialCurso {

    private final int palabras;

    public Artículo(String título, String autor, int palabras) {
        super(título, autor);
        this.palabras = palabras;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("📄 Artículo: " + getTítulo() + " - Autor: " + getAutor() + " - Palabras: " + palabras);
    }
}
