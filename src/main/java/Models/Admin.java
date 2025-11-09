public class Admin extends Usuario {
    public Admin(String nombre) {
        super(nombre, "admin");
    }


    public boolean puedeEliminar() { 
        return true; 
    }


    public boolean puedePublicar() { 
        return true; 
    }
}