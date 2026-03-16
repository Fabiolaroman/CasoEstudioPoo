package biblioteca;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Harry Potter", "J.K Rowling");
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        Usuario usuario1 = new Usuario("Carlos", 1);

        Prestamo prestamo = new Prestamo(libro1, usuario1);

        prestamo.mostrarPrestamo();

    }
}
