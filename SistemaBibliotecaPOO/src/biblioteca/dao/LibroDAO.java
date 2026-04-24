package biblioteca.dao;

import biblioteca.model.Libro;
import java.io.*;
import java.util.ArrayList;

public class LibroDAO {

    private final String archivo = "libros.txt";

    // GUARDAR
    public void guardarLibro(Libro libro){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(libro.getTitulo() + "," + libro.getAutor() + "," + libro.isDisponible());
            bw.newLine();
        } catch (IOException e){
            System.out.println("Error al guardar libro");
        }
    }

    // LEER
    public ArrayList<Libro> obtenerLibros(){
        ArrayList<Libro> libros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                boolean disponible = Boolean.parseBoolean(datos[2]);

                libros.add(new Libro(titulo, autor, disponible));
            }

        } catch (IOException e){
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        }

        return libros;
    }

    // BUSCAR
    public Libro buscarLibro(String titulo){
        for(Libro libro : obtenerLibros()){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }

    // REESCRIBIR ARCHIVO (cuando cambia disponibilidad)
    public void actualizarLibros(ArrayList<Libro> libros){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for(Libro libro : libros){
                bw.write(libro.getTitulo() + "," + libro.getAutor() + "," + libro.isDisponible());
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Error al actualizar libros");
        }
    }
}