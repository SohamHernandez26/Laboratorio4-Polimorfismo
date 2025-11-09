package Models;

public class Articulo extends Contenido {
    private String texto;

    public Articulo(int id, String titulo, String autor, Categoria categoria, String texto) {
        super(id, titulo, autor, categoria);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public String visualizar() {
        return "Artículo: " + titulo + "Autor: " + autor + "Texto: " + texto;
    }

    
}
