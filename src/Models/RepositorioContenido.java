package Models;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContenido {
    private List<Contenido> contenidos = new ArrayList<>();

    public void agregarContenido(Contenido c) { 
        contenidos.add(c); 
    }

    public boolean eliminarContenido(int id) { 
        return contenidos.removeIf(c -> c.getId() == id); 
    }

    public Contenido obtenerContenidoPorId(int id) {
        for (Contenido c : contenidos) if (c.getId() == id) return c;
        return null;
    }

    public List<Contenido> listarContenidos() { 
        return new ArrayList<>(contenidos); 
    }

    public List<Contenido> filtrarPorCategoria(String nombre) {
        List<Contenido> filtrados = new ArrayList<>();
        for (Contenido c : contenidos)
            if (nombre == null || nombre.isEmpty() || c.getCategoria().getNombre().equalsIgnoreCase(nombre))
                filtrados.add(c);
        return filtrados;
    }
}
