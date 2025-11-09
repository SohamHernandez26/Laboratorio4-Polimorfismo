import java.util.*;


public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario registrarUsuario(String nombre, String tipo) {
        Usuario u = new Usuario(nombre, tipo);
        usuarios.add(u);
        return u;
    }

    public Usuario obtenerUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }
}
