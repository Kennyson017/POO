package modulo2.Atividade;
public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor.getNome();
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade(boolean status) {
        this.disponivel = status;
    }
}
