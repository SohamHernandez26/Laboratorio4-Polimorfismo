package Vew;


import Models.*;

public class Main {
    public static void main(String[] args) {
        // Crear categorías
        Categoria tecnologia = new Categoria("Tecnología", "Artículos sobre avances tecnológicos");
        Categoria arte = new Categoria("Arte", "Contenido artístico y cultural");
        Categoria deportes = new Categoria("Deportes", "Contenido deportivo");

        // Crear usuarios
        Usuario editor = new Usuario("María", "editor");
        Usuario autor = new Usuario("Carlos", "autor");

        // Crear repositorio de contenido
        RepositorioContenido repositorio = new RepositorioContenido();

        // Crear diferentes tipos de contenido
        Articulo articulo = new Articulo(1, "Inteligencia Artificial en 2025", 
            autor.getNombre(), tecnologia, 
            "La IA ha avanzado significativamente en los últimos años...");

        Video video = new Video(2, "Tutorial de Pintura", 
            editor.getNombre(), arte, 
            "https://ejemplo.com/video123", 15.5);

        Imagen imagen = new Imagen(3, "Partido Final", 
            autor.getNombre(), deportes, 
            "/imagenes/final2025.jpg", 1920, 1080);

        // Agregar contenido al repositorio
        repositorio.agregarContenido(articulo);
        repositorio.agregarContenido(video);
        repositorio.agregarContenido(imagen);

        // Publicar contenido
        articulo.publicar();
        video.publicar();

        // Mostrar todo el contenido
        System.out.println("\n=== Contenido en el Sistema ===");
        for (Contenido contenido : repositorio.listarContenidos()) {
            System.out.println("\nTipo: " + contenido.getClass().getSimpleName());
            System.out.println("Estado: " + (contenido.isPublicado() ? "Publicado" : "No publicado"));
            System.out.println("Visualización: " + contenido.visualizar());
            System.out.println("Categoría: " + contenido.getCategoria().toString());
            System.out.println("--------------------");
        }

        // Mostrar contenido por categoría
        System.out.println("\n=== Contenido de Tecnología ===");
        for (Contenido contenido : repositorio.filtrarPorCategoria("Tecnología")) {
            System.out.println(contenido.visualizar());
        }

        // Mostrar contenido filtrado
        System.out.println("\n=== Contenido de " + autor.getNombre() + " ===");
        for (Contenido contenido : repositorio.listarContenidos()) {
            if (contenido.getAutor().equals(autor.getNombre())) {
                System.out.println(contenido.visualizar());
            }
        }

        // Demostrar búsqueda de contenido específico
        System.out.println("\n=== Búsqueda de contenido por ID ===");
        Contenido encontrado = repositorio.obtenerContenidoPorId(1);
        if (encontrado != null) {
            System.out.println("Contenido encontrado: " + encontrado.visualizar());
        }
    }
}