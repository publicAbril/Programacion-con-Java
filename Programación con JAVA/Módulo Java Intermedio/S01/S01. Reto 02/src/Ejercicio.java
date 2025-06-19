public class Ejercicio extends MaterialCurso {

    private boolean revisado;

    public Ejercicio(String título, String autor) {
        super(título, autor);
        this.revisado = false;
    }
    public boolean isRevisado() {return revisado;}
    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("📝 Ejercicio: " + getTítulo() + " - Autor: " + getAutor() + " - Revisado: " + revisado);
    }
}
