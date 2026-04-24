package biblioteca.model;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro;
        this.usuario = usuario;
    }

    public void realizarPrestamo(){
        if(libro == null){
            throw new RuntimeException("Libro no encontrado");
        }

        if(!libro.isDisponible()){
            throw new RuntimeException("El libro no está disponible");
        }

        libro.prestar();
    }

    public void mostrarPrestamo(){
        System.out.println(usuario.getNombre() + " tomó prestado: " + libro.getTitulo());
    }
}