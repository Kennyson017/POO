package modulo3;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import modulo2.Atividade.Usuario;

public class UsuarioTest {

    Usuario usuario = new Usuario("João Lucas", 24);

    @Test
    public void testMostrarLivros() {
        
        usuario.adicionarLivro("Clean Code");
        usuario.adicionarLivro("Refatoração");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        usuario.mostrarLivros();

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Livros com o usuário:"));
        assertTrue(consoleOutput.contains("Clean Code"));
        assertTrue(consoleOutput.contains("Refatoração"));
    }

    @Test
    public void testMostrarHistorico() {
        usuario.adicionarLivro("Java Efetivo");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        usuario.mostrarHistorico();

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Historico de Empréstimos:"));
        assertTrue(consoleOutput.contains("Emprestado: Java Efetivo"));
    }
}
