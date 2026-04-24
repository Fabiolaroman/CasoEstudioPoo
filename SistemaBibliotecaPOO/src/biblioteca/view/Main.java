package biblioteca.view;

import biblioteca.controller.BibliotecaController;
import biblioteca.model.*;

public class Main {

    public static void main(String[] args) {

        BibliotecaController controller = new BibliotecaController();

        // Agregar libros (solo se agregan si querés probar)
        controller.agregarLibro("Harry Potter", "J.K Rowling");
        controller.agregarLibro("El Principito", "Antoine de Saint-Exupéry");

        System.out.println("LIBROS:");
        controller.mostrarLibros();

        Usuario usuario = new Usuario("Carlos", 1);

        try {
            Libro libro = controller.buscarLibro("Harry Potter");

            Prestamo prestamo = new Prestamo(libro, usuario);
            prestamo.realizarPrestamo();
            prestamo.mostrarPrestamo();

            controller.actualizarEstado(libro);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nESTADO FINAL:");
        controller.mostrarLibros();
    }
}
