import java.util.*;


public class ContenidoController {
    private RepositorioContenido repo;

    public ContenidoController(RepositorioContenido repo) {
        this.repo = repo; 
    }

    public Contenido crearContenido(String tipo, Map<String, Object> datos) {
        int id = (int) datos.get("id");
        String titulo = (String) datos.get("titulo");
        String autor = (String) datos.get("autor");
        Categoria cat = (Categoria) datos.get("categoria");

        switch (tipo.toLowerCase()) {
           case "articulo":
               Articulo a = new Articulo(id, titulo, autor, cat, (String) datos.get("texto"));
               repo.agregarContenido(a);
               return a;
            
            case "video":
                Video v = new Video(id, titulo, autor, cat, (String) datos.get("url"), (double) datos.get("duracion"));
                repo.agregarContenido(v);
                return v;
            
            case "imagen":
                Imagen i = new Imagen(id, titulo, autor, cat, (String) datos.get("ruta"), (int) datos.get("ancho"), (int) datos.get("alto"));
                repo.agregarContenido(i);
                return i;
            
            default:
                return null;
        }
    }

    public boolean editarContenido(int id, Map<String, Object> datos) {
        Contenido c = repo.obtenerContenidoPorId(id);
        if (c == null) return false;
        if (datos.containsKey("titulo")) c.titulo = (String) datos.get("titulo");
        if (datos.containsKey("autor")) c.autor = (String) datos.get("autor");
        return true;
    }

    public boolean eliminarContenido(int id) {
        return repo.eliminarContenido(id);
    }

    public String visualizarContenido(int id) {
        Contenido c = repo.obtenerContenidoPorId(id);
        return c != null ? c.visualizar() : "Contenido no encontrado";
    }

    public List<Contenido> listarContenidosPorCategoria() {
        return repo.listarContenidos();
    }

    public List<Contenido> buscarPorCategoria(String nombre) {
        return repo.filtrarPorCategoria(nombre);
    }
}
