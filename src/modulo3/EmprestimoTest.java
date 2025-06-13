package modulo3;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import modulo2.Atividade.Autor;
import modulo2.Atividade.Emprestimo;
import modulo2.Atividade.Livro;
import modulo2.Atividade.Usuario;

public class EmprestimoTest {
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(usuario, livro, dataRetirada, dataDevolucao);

    @Test
    public void testGetUsuario() {
        assertEquals("Gabriel", emprestimo.getUsuario());
    }

    @Test
    public void testGetLivro() {
        assertEquals("Java Basics", emprestimo.getLivro());
    }

    @Test
    public void testGetDataRetirada() {
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
}
