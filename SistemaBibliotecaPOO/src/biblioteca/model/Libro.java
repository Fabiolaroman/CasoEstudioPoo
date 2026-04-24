package biblioteca.model;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public boolean isDisponible(){ return disponible; }

    public void prestar(){ disponible = false; }
    public void devolver(){ disponible = true; }
}