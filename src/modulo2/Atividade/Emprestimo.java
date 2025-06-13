package modulo2.Atividade;
import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;
    Date hoje = new Date();

    public Emprestimo(Usuario usuario, Livro livro, Date dataRetirada, Date dataDevolucao) {
        
        if (!livro.isDisponivel()) {
            throw new IllegalArgumentException("O livro '" + livro.getTitulo() + "' está indisponivel.");
        }

        this.usuario = usuario;
        this.livro = livro;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        livro.validarDisponibilidade(false);
    }

    public String getUsuario() {
        return usuario.getNome();
    }

    public String getLivro() {
        return livro.getTitulo();
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void getAll() {
        System.out.println("----------- " + this + " -----------");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolução: " + dataDevolucao);
    }
}
