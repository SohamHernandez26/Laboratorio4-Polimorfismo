public class Contenido implements Publicable {
    protected int id;
    protected String titulo;
    protected String autor;
    protected Categoria categoria;
    protected boolean publicado;

    public Contenido(int id, String titulo, String autor, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.publicado = false;
    }

    public int getId() { 
        return id; 
    }

    public String getTitulo() { 
        return titulo; 
    }

    public String getAutor() { 
        return autor; 
    }

    public Categoria getCategoria() { 
        return categoria;
    }

    public boolean isPublicado() { return publicado; }
    public void setPublicado(boolean publicado) { this.publicado = publicado; }

    public void publicar() {
        this.publicado = true;
    }

    public String visualizar() {
        return "Contenido Generico" + titulo;
    }
    
}
