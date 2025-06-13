package modulo3;

import modulo2.Atividade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PessoaTest {
    Pessoa pessoa = new Pessoa("Jessica", 25);

    @Test
    public void testGetNome() {
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testIdadeNacionalidade(){
        pessoa.setNacionalidade("brasileira");

        assertEquals("brasileira", pessoa.getNacionalidade());
        assertEquals(25, pessoa.getIdade());
    }
}