package ejercicios.ejercicio3;

public class Libro {
    private String titulo;
    private int isbn;
    private String autor;
    private boolean enPrestamo;

    public Libro() {
        this.enPrestamo = false;
    }

    public Libro(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.enPrestamo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo() {
        this.enPrestamo = true;
    }

    public void devolucion() {
        this.enPrestamo = false;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ", " + this.getIsbn() + ", " + this.getAutor();
    }
}
