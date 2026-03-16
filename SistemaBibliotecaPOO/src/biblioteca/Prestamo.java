package biblioteca;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro;
        this.usuario = usuario;
    }

    public void mostrarPrestamo(){
        System.out.println(usuario.getNombre() + " tomó prestado el libro " + libro.getTitulo());
    }
}
