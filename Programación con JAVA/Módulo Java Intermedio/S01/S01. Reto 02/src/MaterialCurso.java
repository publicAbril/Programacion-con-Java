public abstract class MaterialCurso {

    private final String título;
    private final String autor;

    public MaterialCurso(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public String getTítulo() {return título;}
    public String getAutor() {return autor;}

    public abstract void mostrarDetalle();
}

