package modulo3;

import modulo2.Atividade.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class LivroTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    public void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals("Jess", livro1.getAutor());
        assertEquals("Jess", livro2.getAutor());
    }

    @Test
    public void testgetGenero() {
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals("tecnologia", livro2.getGenero());
    }

    @Test
    public void testisDisponivel() {
        assertEquals(true, livro1.isDisponivel());
        assertEquals(false, livro2.isDisponivel());

    }
}