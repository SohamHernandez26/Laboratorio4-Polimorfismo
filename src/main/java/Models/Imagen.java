public class Imagen extends Contenido {
    private String ruta;
    private int ancho;
    private int alto;


    public Imagen(int id, String titulo, String autor, Categoria categoria, String ruta, int ancho, int alto) {
        super(id, titulo, autor, categoria);
        this.ruta = ruta;
        this.ancho = ancho;
        this.alto = alto;
    }


    public String getRuta() { 
        return ruta; 
    }
    public int getAncho() { 
        return ancho; 
    }
    public int getAlto() { 
        return alto; 
    }


    public String visualizar() {
        return "Imagen: " + titulo + " (" + ancho + "x" + alto + ") Ruta: " + ruta;
    }
}
