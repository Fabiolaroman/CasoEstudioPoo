package biblioteca.controller;

import biblioteca.model.Libro;

import java.util.ArrayList;

import biblioteca.dao.LibroDAO;

public class BibliotecaController {

    private LibroDAO dao;

    public BibliotecaController(){
        dao = new LibroDAO();
    }

    public void agregarLibro(String titulo, String autor){
        dao.guardarLibro(new Libro(titulo, autor, true));
    }

    public void mostrarLibros(){
        ArrayList<Libro> libros = dao.obtenerLibros();

        for(Libro libro : libros){
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() +
                    " | Disponible: " + libro.isDisponible());
        }
    }

    public Libro buscarLibro(String titulo){
        return dao.buscarLibro(titulo);
    }

    public void actualizarEstado(Libro libro){
        ArrayList<Libro> libros = dao.obtenerLibros();

        for(Libro l : libros){
            if(l.getTitulo().equalsIgnoreCase(libro.getTitulo())){
                l.prestar();
            }
        }

        dao.actualizarLibros(libros);
    }
}