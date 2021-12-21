/**
 * The type Livro.
 */
public class Livro {
    private String titulo, autor;

    /**
     * Instantiates a new Livro.
     *
     * @param titulo the titulo
     * @param autor  the autor
     */
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Gets autor.
     *
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Gets titulo.
     *
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", Autor='" + this.autor + '\'' +
                '}';
    }

}
