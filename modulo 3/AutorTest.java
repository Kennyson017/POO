package modulo3;

import modulo2.Atividade.Autor;
import modulo2.Atividade.Livro;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AutorTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    

    @Test
    public void testListarObras() {
        autor.adicionarObra(livro1);
        autor.adicionarObra(livro2);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        autor.listarObras();

        String saida = outContent.toString();

        assertTrue(saida.contains("Obras publicadas por Jess:"));
        assertTrue(saida.contains("Java Basico"));
        assertTrue(saida.contains("Java Avançado(tecnologia)"));
    }

    @Test
    public void testListarObrasPorGenero() {

        autor.adicionarObra(livro1);
        autor.adicionarObra(livro2);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        autor.listarObrasPorGenero();

        String saida = outContent.toString();

        assertTrue(saida.contains("Obras por gênero de Jess:"));
        assertTrue(saida.contains("Gênero: tecnologia"));
        // assertTrue(saida.contains("Gênero: culinária"));
        assertTrue(saida.contains("Java Basico"));
        assertTrue(saida.contains("Java Avançado"));
        // assertTrue(saida.contains("Culinária Rápida"));
    }
}
