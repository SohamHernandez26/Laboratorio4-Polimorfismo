public class Video extends Contenido {
    private String url;
    private double duracion;

    public Video(int id, String titulo, String autor, Categoria categoria, String url, double duracion) {
        super(id, titulo, autor, categoria);
        this.url = url;
        this.duracion = duracion;
    }

    public String getUrl() {
        return url;
    }

    public double getDuracion() {
        return duracion;
    }

    public String visualizar() {
        return "Video: " + titulo + "(" + duracion + "main) Url:" + url;
    }
}
