package main.java.Models.Vew;

import java.util.Scanner;
import main.java.Models.Models.Usuario;


public class VistaCMS {
    private Scanner sc = new Scanner(System.in);


    public int menuPrincipal(Usuario u) {
        System.out.println("\n--- CMS TERMINAL ---");
        System.out.println("Usuario: " + u.getNombre());
        System.out.println("1. Crear contenido");
        System.out.println("2. Ver contenidos");
        System.out.println("3. Publicar contenido");
        System.out.println("4. Eliminar contenido");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }


    public int elegirTipoContenido() {
        System.out.println("1. Artículo");
        System.out.println("2. Video");
        System.out.println("3. Imagen");
        System.out.print("Tipo: ");
        return sc.nextInt();
    }


    public String leerLinea(String msg) {
        System.out.print(msg);
        sc.nextLine(); // limpiar
        return sc.nextLine();
    }

    public double leerDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }


    public int leerInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }
}