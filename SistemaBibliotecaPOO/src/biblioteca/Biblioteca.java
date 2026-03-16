package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca(){
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){

        for(Libro libro : libros){
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }

    }
}